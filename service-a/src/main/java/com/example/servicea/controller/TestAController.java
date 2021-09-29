package com.example.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestAController {
    @Value("${name}")
    private String name;
    @RequestMapping("testA")
    public String TestA(){
        return "Hello,SpringCloud for TestA name:"+name;
    }
}
