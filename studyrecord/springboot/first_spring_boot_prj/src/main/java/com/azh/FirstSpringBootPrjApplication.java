package com.azh;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/*@ComponentScan(basePackages = {"com.azh.*"})
@EnableAutoConfiguration*/

// 组合注解
@SpringBootApplication
public class FirstSpringBootPrjApplication {
    public static void main(String[] args) {
        // ----设置 Banner 是否启动 start----
        SpringApplicationBuilder banner = new SpringApplicationBuilder(FirstSpringBootPrjApplication.class);
        banner.bannerMode(Banner.Mode.OFF).run(args);
        // ---- end----

        // ----默认启动 start----
        //SpringApplication.run(FirstSpringBootPrjApplication.class, args);
        // ----end----
    }
}