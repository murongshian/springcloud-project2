package com.example.aaa.feign;

import com.example.aaa.hystrix.AaaHystrix;
import com.example.aaa.vo.AaaVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "bbb",fallback = AaaHystrix.class)//对应哪一个微服务
//@RequestMapping("bbb")//加了fallback之后好像无法在这里使用@RequestMapping注解
public interface AaaClient {
    @PostMapping("bbb/bbb")
    List<Integer> feignTest(@RequestBody AaaVo aaaVo);
}