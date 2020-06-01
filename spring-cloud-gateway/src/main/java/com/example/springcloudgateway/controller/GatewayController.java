package com.example.springcloudgateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GatewayController {
    @PostMapping("test")
    @ResponseBody
    public List<Integer> aaa(){
        List<Integer> list = new ArrayList<>();
        list.add(333);
        list.add(444);
        return list;
    }
}