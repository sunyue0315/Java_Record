package com.anzhi.worktest.retry.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.remoting.RemoteAccessException;

/**
 * @Package: com.anzhi.worktest.retry.util
 * @ClassName: RetryGuavaDemoTask
 * @Author: AZ
 * @CreateTime: 2021/11/10 23:05
 * @Description:
 */
@Slf4j
public class RetryGuavaDemoTask {
    /**
     * 重试方法
     */
    public static boolean retryTask(String param){
        log.info("收到请求参数: {}", param);

        int result = RandomUtils.nextInt(0, 11);
        log.info("随机生成的数: {}", result);
        if(result < 2){
            log.info("小于2, 抛出参数异常");
            throw new IllegalArgumentException("参数异常");
        }else if(result < 5){
            log.info("小于5, 返回true");
            return true;
        }else if(result < 7){
            log.info("小于7, 返回false");
            return false;
        }else{
            log.info("大于7, 抛出自定义异常");
            throw new RemoteAccessException("大于7, 抛出自定义异常");
        }
    }
}
