package com.zhao.product.api;

import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product",path = "api",contextId = "example")
public interface ExampleApi {
    @GetMapping("/example")
    Response<Void> example();
}
