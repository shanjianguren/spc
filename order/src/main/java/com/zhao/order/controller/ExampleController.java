package com.zhao.order.controller;


import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {


    @GetMapping("/example")
    public Response<Void> example(){

        return null;
    }
}
