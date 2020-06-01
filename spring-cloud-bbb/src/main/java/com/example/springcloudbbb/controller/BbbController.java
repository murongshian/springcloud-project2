package com.example.springcloudbbb.controller;

import com.example.springcloudbbb.feign.BbbClient;
import com.example.springcloudbbb.vo.BbbVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("bbb")
public class BbbController {
    @Resource
    private BbbClient bbbClient;

    @PostMapping("bbb")
    @ResponseBody
    public List<Integer> aaa(@RequestBody BbbVo bbbVo) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(bbbVo.toString());
        List<Integer> list = new ArrayList<>();
        list.add(333);
        list.add(444);
        return list;
    }
    @PostMapping("ccc")
    @ResponseBody
    public List<Integer> ccc(@RequestBody BbbVo bbbVo){
        System.out.println(bbbVo.toString());
        List<Integer> list = new ArrayList<>();
        list.add(777);
        list.add(888);
        return list;
    }
    @PostMapping("ddd")
    @ResponseBody
    public List<Integer> ddd(@RequestBody BbbVo bbbVo){
        return bbbClient.feignTest(bbbVo);
    }
}