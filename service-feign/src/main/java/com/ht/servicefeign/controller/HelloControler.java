package com.ht.servicefeign.controller;

import com.ht.servicefeign.service.FeignServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    private FeignServiceHi feignServiceHi;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "ht") String name){
        System.out.println("我 是 feign");
        return feignServiceHi.sayHiFromServiceClient(name);
    }
}
