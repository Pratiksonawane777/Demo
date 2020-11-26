package com.sunnytech.in.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "my-app")
public interface MyAppFeign {

    @GetMapping(path = "/getstring", produces = "application/json", consumes = "application/json" )
    String getSuccessString();
}
