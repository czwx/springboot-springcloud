package com.ht.servicefeign.service.fallback;

import com.ht.servicefeign.service.FeignServiceHi;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceHiHystric implements FeignServiceHi {

    @Override
    public String sayHiFromServiceClient(String name) {
        return "sorry la, " + name + ", this is server exception";
    }
}