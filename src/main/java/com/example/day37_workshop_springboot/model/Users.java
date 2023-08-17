package com.example.day37_workshop_springboot.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private String userId;
    private String userName;
    private String userEmail;
    private Boolean express;

    // public Users(String userName, String userEmail, Boolean express) {
    //     this.userId = UUID.randomUUID().toString().substring(0, 8);
    //     this.userName = userName;
    //     this.userEmail = userEmail;
    //     this.express = express;
    // }

}
