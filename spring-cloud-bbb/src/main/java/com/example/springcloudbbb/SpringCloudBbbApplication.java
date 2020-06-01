package com.example.springcloudbbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.springcloudbbb.feign")//提供feign扫描位置
@EnableHystrix
public class SpringCloudBbbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudBbbApplication.class, args);
    }

}
