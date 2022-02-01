package com.anzhi.worktest.retry.demo;

import com.anzhi.worktest.retry.util.RetryDemoTaskUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.backoff.FixedBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Package: com.anzhi.worktest.Retry.demo
 * @ClassName: RetryTask
 * @Author: AZ
 * @CreateTime: 2021/11/7 19:04
 * @Description:
 */
@Slf4j
public class SpringRetryTemplateTest {

    /**
     * 重试时间间隔
     */
    private long fixedPeriodTime = 1000L;

    /**
     * 最大重试次数， 默认为3
     */
    private int maxRetryTimes = 3;

    /**
     * 表示那些异常需要重试， key表示异常的字节码， value为true表示需要重试
     */
    private Map<Class<? extends Throwable>, Boolean> exceptionMap = new HashMap<>();

    @Test
    public void testRetry(){

        // 设置重试回退策略， 主要设置重试时间间隔
        FixedBackOffPolicy backOffPolicy = new FixedBackOffPolicy();
        backOffPolicy.setBackOffPeriod(fixedPeriodTime);

        // 设置重试策略，主要设置重试次数, 以及什么异常进行重试
        exceptionMap.put(RemoteAccessException.class, true);
        SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy(maxRetryTimes, exceptionMap);

        // 构建重试模板实列
        RetryTemplate retryTemplate = new RetryTemplate();

        retryTemplate.setRetryPolicy(retryPolicy);
        retryTemplate.setBackOffPolicy(backOffPolicy);

        Boolean excute = retryTemplate.execute(
                retryContext -> {
                    boolean b = RetryDemoTaskUtil.retyrTask("abc");
                    log.info("调用结果: {}", b);
                    return b;
                },
                retryContext -> {
                    log.info("已经达到最大重试次数或抛出了不重试的异常");
                    return false;
                });
        log.info("执行结果: {}", excute);
    }

}
