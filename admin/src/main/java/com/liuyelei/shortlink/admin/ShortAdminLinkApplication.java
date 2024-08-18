package com.liuyelei.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.liuyelei.shortlink.admin.remote")
@MapperScan("com.liuyelei.shortlink.admin.dao.mapper")
public class ShortAdminLinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortAdminLinkApplication.class, args);
    }
}
