package com.ht.servicefeign.service;

import com.ht.servicefeign.service.fallback.FeignServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client", fallback = FeignServiceHiHystric.class)
public interface FeignServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHiFromServiceClient(@RequestParam(value = "name") String name);
}
