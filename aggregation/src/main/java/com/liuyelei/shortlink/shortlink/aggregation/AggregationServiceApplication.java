package com.liuyelei.shortlink.shortlink.aggregation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 短链接聚合应用
 */
@SpringBootApplication(scanBasePackages = {
        "com.liuyelei.shortlink.admin",
        "com.liuyelei.shortlink.project"
})
@EnableDiscoveryClient
@MapperScan(value = {
        "com.liuyelei.shortlink.project.dao.mapper",
        "com.liuyelei.shortlink.admin.dao.mapper"
})
public class AggregationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregationServiceApplication.class, args);
    }
}