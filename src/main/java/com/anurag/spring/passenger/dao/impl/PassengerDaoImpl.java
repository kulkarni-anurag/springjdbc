package com.anurag.spring.passenger.dao.impl;

import com.anurag.spring.passenger.Passenger;
import com.anurag.spring.passenger.dao.PassengerDao;

import org.springframework.jdbc.core.JdbcTemplate;

public class PassengerDaoImpl implements PassengerDao {

    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(Passenger passenger) {
        String sql = "INSERT INTO passengers(firstname, lastname) values (?, ?)";
        int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName());
        return result;
    }

    @Override
    public int update(Passenger passenger) {
        String sql = "UPDATE passengers SET firstname = ?, lastname = ? WHERE id = ?";
        int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
        return result;
    }
    
}
