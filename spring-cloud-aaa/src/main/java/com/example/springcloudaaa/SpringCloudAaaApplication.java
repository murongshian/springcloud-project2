package com.example.springcloudaaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.springcloudaaa.feign")//提供feign扫描位置
@EnableHystrix
public class SpringCloudAaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAaaApplication.class, args);
    }

}
