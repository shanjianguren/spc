package com.zhao.order.controller;


import com.zhao.order.service.ExampleOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ExampleOrderController {

    @Autowired
    ExampleOrderService exampleService;

    @GetMapping("/example1")
    public Response<Void> example(){
        exampleService.example();
        log.info("order controller--------------");
        return null;
    }
}
