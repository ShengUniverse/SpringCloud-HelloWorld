package com.example.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reserve")
    public String reserve(){
        System.out.println("Reserved");
        return "Hello World! The stock is reserved!";
    }
}
