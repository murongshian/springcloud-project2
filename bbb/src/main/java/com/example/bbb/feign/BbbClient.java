package com.example.bbb.feign;

import com.example.bbb.hystrix.BbbHystrix;
import com.example.bbb.vo.BbbVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "aaa",fallback = BbbHystrix.class)
//@RequestMapping("aaa")//加了fallback之后好像无法在这里使用@RequestMapping注解
public interface BbbClient {
    @PostMapping("aaa/aaa")
    List<Integer> feignTest(@RequestBody BbbVo bbbVo);
}