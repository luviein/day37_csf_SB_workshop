package com.example.day37_workshop_springboot.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.example.day37_workshop_springboot.model.OrderDetails;
import com.example.day37_workshop_springboot.model.Users;

@Repository
public class UserRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String INSERTSQL = "insert into users (u_id, customer_name, customer_email, express) values(?, ?, ?, ?) ";

    public Integer createUser(Users user) {
        PreparedStatementCreator psc = new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(INSERTSQL);
                ps.setString(1, user.getUserId());
                ps.setString(2, user.getUserName());
                ps.setString(3, user.getUserEmail());
                ps.setBoolean(4, user.getExpress());


                return ps;
            }
 
        };

        return jdbcTemplate.update(psc);
    }
}
