package com.anzhi.worktest.retry.util;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.remoting.RemoteAccessException;

/**
 * @Package: com.anzhi.worktest.Retry
 * @ClassName: RetryDemoTask
 * @Author: AZ
 * @CreateTime: 2021/10/31 13:57
 * @Description:
 */

@Slf4j
public class RetryDemoTaskUtil {

    /**
     * 重试方法
     * @param param
     * @return
     */
    public static boolean retyrTask(String param){
        log.info("收到请求参数: {}", param);

        int i = RandomUtils.nextInt(0, 11);
        log.info("随机生成的参数: {}", i);
        if(i == 0){
            log.info("为0， 抛出参数异常");
            throw new IllegalArgumentException("参数异常");
        }else if(i ==1){
            log.info("为1， 返回true");
            return true;
        }else if(i == 2){
            log.info("为2，返回false");
            return false;
        }else{
            // 为其他
            log.info("大于2， 抛出自定义异常");
            throw new RemoteAccessException("大于2, 抛出远程访问异常");
        }
    }
}
