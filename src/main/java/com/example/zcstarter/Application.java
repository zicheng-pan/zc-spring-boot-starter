package com.example.zcstarter;

import com.example.zcstarter.config.HelloworldService;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    // 非web条件下运行
    public static ConfigurableApplicationContext noneWebApplicationRun(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.NONE)
                .bannerMode(Banner.Mode.OFF).run(args);
        return context;
    }

    // web条件下运行
    public static ConfigurableApplicationContext webApplicationRun(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.SERVLET)
                .bannerMode(Banner.Mode.OFF).run(args);
        return context;
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = webApplicationRun(args);
        //在非web场景下会正常运行，在web条件下会抛出bean未定义异常
        HelloworldService helloworldService = (HelloworldService) context.getBean("getMsg");
        helloworldService.sayHello();
    }
}
