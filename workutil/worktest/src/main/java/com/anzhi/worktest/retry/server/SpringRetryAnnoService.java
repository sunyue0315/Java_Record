package com.anzhi.worktest.retry.server;

import com.anzhi.worktest.retry.util.RetryDemoTaskUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @Package: com.anzhi.worktest.Retry.demo
 * @ClassName: SpringRetryAnnoDemo
 * @Author: AZ
 * @CreateTime: 2021/11/8 22:32
 * @Description:
 */
@Service
@Slf4j
public class SpringRetryAnnoService {

    @Retryable(value = {RemoteAccessException.class, IllegalArgumentException.class}, maxAttempts = 3, backoff = @Backoff(delay = 2000L, multiplier = 2))
    public boolean call(String param){
        return RetryDemoTaskUtil.retyrTask("abc");
    }

    @Recover
    public boolean recover(Exception e, String param){
        log.error("达到最大重试次数，或抛出了一个没有指定进行重试的异常 {}", e);
        return false;
    }
}
