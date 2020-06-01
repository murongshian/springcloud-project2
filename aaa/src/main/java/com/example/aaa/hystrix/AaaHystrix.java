package com.example.aaa.hystrix;

import com.example.aaa.feign.AaaClient;
import com.example.aaa.vo.AaaVo;
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