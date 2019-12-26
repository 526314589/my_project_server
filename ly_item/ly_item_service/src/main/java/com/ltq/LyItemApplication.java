package com.ltq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-13 10:42
 * @Description:   商品微服务启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ltq.item.mapper")//扫描接口包
public class LyItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class,args);
    }
}
