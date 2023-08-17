package com.example.day37_workshop_springboot.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.day37_workshop_springboot.model.OrderDetails;
import com.example.day37_workshop_springboot.model.Users;
import com.example.day37_workshop_springboot.repo.OrderDetailsRepo;
import com.example.day37_workshop_springboot.repo.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private OrderDetailsRepo orderDetailsRepo;

    @Autowired
    private UserRepo userRepo;

    
    @Transactional
    public Boolean makeOrder(Users users, List<OrderDetails> orderDetails) {
        String userId = UUID.randomUUID().toString().substring(0, 8);
        users.setUserId(userId);
        // Users newUser = new Users(users.getUserName(), users.getUserEmail(), users.getExpress());
        userRepo.createUser(users);
        System.out.println("in transaction >>>>>>>"+users);
        for(OrderDetails od : orderDetails) {
            od.setUserId(userId);
            orderDetailsRepo.createOrderDetails(users, od);
        }

        return true;
        
    }


    
}
