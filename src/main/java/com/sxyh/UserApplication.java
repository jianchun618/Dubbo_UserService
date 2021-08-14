package com.sxyh;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author :
 * @param :注册服务
 */

@EnableDubbo  //开启基于注解的dubbo功能
@SpringBootApplication
@MapperScan(basePackages="com.sxyh.dao")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
