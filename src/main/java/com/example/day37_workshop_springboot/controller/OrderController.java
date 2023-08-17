package com.example.day37_workshop_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day37_workshop_springboot.payload.OrderRequest;
import com.example.day37_workshop_springboot.service.UserService;

@RestController
@RequestMapping(path = "/api/order")
public class OrderController {
    
    @Autowired
    UserService userSvc;

    @PostMapping
    public ResponseEntity<Boolean> createOrder (@RequestBody OrderRequest orderRequest) {
        Boolean result = userSvc.makeOrder(orderRequest.getUsers(), orderRequest.getOrderDetails());
        return ResponseEntity.ok().body(result);
    }
}
