package com.binary.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import utils.DateUtils;

/**
 * @author Lijw
 * @Date 2021-01-05
 */
@SpringBootApplication
@MapperScan("com.binary.app.dao")
@EnableSwagger2
public class SystemManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemManageApplication.class, args);
    }

}
