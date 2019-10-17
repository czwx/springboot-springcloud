package com.ht.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi?name=" + name, String.class);
    }

    public String hystrixError(String name) {
        return "sorry la, " + name + ", this is server exception";
    }
}
