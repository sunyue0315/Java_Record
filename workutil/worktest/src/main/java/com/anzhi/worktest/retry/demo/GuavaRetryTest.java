package com.anzhi.worktest.retry.demo;

import com.anzhi.worktest.retry.util.RetryGuavaDemoTask;
import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.github.rholder.retry.WaitStrategies;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.remoting.RemoteAccessException;

import java.util.concurrent.TimeUnit;

/**
 * @Package: com.anzhi.worktest.retry.demo
 * @ClassName: GuavaRetryTest
 * @Author: AZ
 * @CreateTime: 2021/11/10 23:29
 * @Description:
 */
@Slf4j
public class GuavaRetryTest {

    @Test
    public void fun01(){
        // RetryerBuilder 构建重试实例 retryer,可以设置重试源且可以支持多个重试源，可以配置重试次数或重试超时时间，
        // 以及可以配置等待时间间隔
        Retryer<Boolean> retryer = RetryerBuilder.<Boolean> newBuilder()
                .retryIfExceptionOfType(RemoteAccessException.class) //设置异常重试源
                .retryIfExceptionOfType(IllegalArgumentException.class)
                .retryIfResult(res -> res == false) //设置根据结果重试
                .withWaitStrategy(WaitStrategies.fixedWait(3, TimeUnit.SECONDS)) // 设置等待时间间隔
                .withStopStrategy(StopStrategies.stopAfterAttempt(3)) //设置最大重试次数
                .build();
        try {
            retryer.call(() -> RetryGuavaDemoTask.retryTask("abc"));
        }catch (Exception e){
            log.info("重试异常: {}", e);
        }
    }
}
