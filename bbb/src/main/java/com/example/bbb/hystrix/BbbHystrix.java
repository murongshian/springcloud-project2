package com.example.bbb.hystrix;

import com.example.bbb.feign.BbbClient;
import com.example.bbb.vo.BbbVo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BbbHystrix implements BbbClient {
    @Override
    public List<Integer> feignTest(BbbVo bbbVo) {
        List<Integer> list = new ArrayList<>();
        list.add(500);
        return list;
    }
}