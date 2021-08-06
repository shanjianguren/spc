package com.zhao.order.service;


import com.zhao.product.api.ExampleApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExampleOrderService {

    @Autowired
    ExampleApi api;

    public void example(){
        api.example();
        log.info("order service-----------");
    }

}
