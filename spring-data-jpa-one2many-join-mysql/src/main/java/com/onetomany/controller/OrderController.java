package com.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.dto.OrderRequest;
import com.onetomany.dto.OrderResponse;
import com.onetomany.entity.Customer;

import com.onetomany.service.OrderService;


@RestController
public class OrderController {
    @Autowired
    private OrderService  orderService;
    
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
       return orderService.placeOrder(request);
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return orderService.findAllOrders();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return orderService.getJoinInformation();
    }
}