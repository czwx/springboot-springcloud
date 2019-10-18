package com.ht.serviceribbon.controller;

import com.ht.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "ht") String name) {
        System.out.println("我 是 ribbon");
        return helloService.helloService(name);
    }
}
