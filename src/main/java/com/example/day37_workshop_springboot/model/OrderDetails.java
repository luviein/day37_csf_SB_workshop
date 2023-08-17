package com.example.day37_workshop_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    private Integer orderId;
    private String userId;
    private String itemName;
    private String quantity;
    private Float price;
}
