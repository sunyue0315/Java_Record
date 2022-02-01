package com.anzhi.worktest.retry.common;

import com.anzhi.worktest.WorkTestApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Package: com.anzhi.worktest.Retry.common
 * @ClassName: SpringRetryAnnotation
 * @Author: AZ
 * @CreateTime: 2021/11/8 22:27
 * @Description:
 */
@Slf4j
@SpringBootTest(classes = WorkTestApplication.class)
@RunWith(SpringRunner.class)
public class SpringRetryAnnotation {

    @Before
    public void init(){
        log.info("-------------测试开始-----------------");
    }


    @After
    public void after(){
        log.info("-------------测试结束-----------------");
    }
}
