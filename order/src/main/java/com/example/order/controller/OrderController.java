package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")

public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/place_order")
    public String place_order(){
        //System.out.println("Order Placed!");
        String msg = restTemplate.getForObject("http://stock-service/stock/reserve",String.class);
        return "(Step1)Hello World! It's an order!" + "\n   (Step2)" + msg;
    }
}