package com.anzhi.worktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @Package: com.anzhi.worktest
 * @ClassName: WorkTestApplication
 * @Author: AZ
 * @CreateTime: 2021/11/7 17:20
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.anzhi.worktest.*")
@EnableRetry // 支持Spring boot 重试机制
public class WorkTestApplication {
    public static void main(String[] args) {
        System.setProperty("workTest", "workTest");
        SpringApplication.run(WorkTestApplication.class, args);
    }
}
