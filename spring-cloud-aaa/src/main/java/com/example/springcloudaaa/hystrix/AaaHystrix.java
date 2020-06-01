package com.example.springcloudaaa.hystrix;

import com.example.springcloudaaa.feign.AaaClient;
import com.example.springcloudaaa.vo.AaaVo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AaaHystrix implements AaaClient {
    @Override
    public List<Integer> feignTest(AaaVo aaaVo) {
        List<Integer> list = new ArrayList<>();
        list.add(500);
        return list;
    }
}