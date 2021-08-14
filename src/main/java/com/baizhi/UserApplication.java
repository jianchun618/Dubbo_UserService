package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author :
 * @param :注册服务
 */
//@SpringBootApplication(exclude = {MybatisAutoConfiguration.class,DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan(basePackages="com.baizhi.dao")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
