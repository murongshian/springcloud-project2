package com.example.springcloudgateway.feign;

import com.example.springcloudgateway.vo.BbbVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "aaa")
public interface BbbClient {
    @PostMapping("test")
    List<Integer> sayHiFromClientOne(@RequestBody BbbVo bbbVo);
}