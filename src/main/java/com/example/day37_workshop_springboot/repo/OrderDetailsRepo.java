package com.example.day37_workshop_springboot.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.example.day37_workshop_springboot.model.OrderDetails;
import com.example.day37_workshop_springboot.model.Users;

@Repository
public class OrderDetailsRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String INSERTSQL = "insert into order_details (user_id, item_name, item_quantity, unit_price) values(?, ?, ?, ?)";

     public Integer createOrderDetails(Users user, OrderDetails details) {
        PreparedStatementCreator psc = new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(INSERTSQL);
                
                ps.setString(1, details.getUserId());
                ps.setString(2, details.getItemName());
                ps.setString(3, details.getQuantity());
                ps.setFloat(4, details.getPrice());
                return ps;
            }
 
        };

        return jdbcTemplate.update(psc);
    }
}
