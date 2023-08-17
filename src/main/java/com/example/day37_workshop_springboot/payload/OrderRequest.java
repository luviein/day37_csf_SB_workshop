package com.example.day37_workshop_springboot.payload;

import java.util.List;

import com.example.day37_workshop_springboot.model.OrderDetails;
import com.example.day37_workshop_springboot.model.Users;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderRequest {
    private Users users;
    private List<OrderDetails> orderDetails;
}
