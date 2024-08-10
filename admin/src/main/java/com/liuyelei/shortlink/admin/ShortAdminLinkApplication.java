package com.liuyelei.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liuyelei.shortlink.admin.dao.mapper")
public class ShortAdminLinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortAdminLinkApplication.class, args);
    }
}
