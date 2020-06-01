package com.example.springcloudaaa.controller;

import com.example.springcloudaaa.feign.AaaClient;
import com.example.springcloudaaa.vo.AaaVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("aaa")
public class AaaController {
    @Resource
    private AaaClient aaaClient;

    @PostMapping("aaa")
    @ResponseBody
    public List<Integer> aaa(@RequestBody AaaVo aaaVo){
        System.out.println(aaaVo.toString());
        List<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        return list;
    }

    @PostMapping("ccc")
    @ResponseBody
    public List<Integer> ccc(@RequestBody AaaVo aaaVo){
        System.out.println(aaaVo.toString());
        List<Integer> list = new ArrayList<>();
        list.add(555);
        list.add(666);
        return list;
    }
    @PostMapping("ddd")
    @ResponseBody
    public List<Integer> ddd(@RequestBody AaaVo aaaVo){
        return aaaClient.feignTest(aaaVo);
    }
}