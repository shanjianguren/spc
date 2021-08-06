package com.zhao.product.controller;


import com.zhao.product.api.ExampleApi;
import com.zhao.product.service.ExampleService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ExampleController implements ExampleApi {

    @Autowired
    ExampleService exampleService;

    @GetMapping("/example")
    public Response<Void> example(){
        exampleService.example();
        log.info("product controller-------");
        return null;
    }
}
