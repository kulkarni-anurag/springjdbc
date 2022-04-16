package com.anurag.spring.passenger.dao.impl;

import java.util.List;

import com.anurag.spring.passenger.Passenger;
import com.anurag.spring.passenger.dao.PassengerDao;
import com.anurag.spring.passenger.rowmapper.PassengerRowMapper;

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

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM passengers WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public Passenger read(int id) {
        String sql = "SELECT * FROM passengers WHERE id = ?";
        PassengerRowMapper rowMapper = new PassengerRowMapper();
        Passenger passenger = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return passenger;
    }

    @Override
    public List<Passenger> read() {
        String sql = "SELECT * FROM passengers";
        PassengerRowMapper rowMapper = new PassengerRowMapper();
        List<Passenger> result = jdbcTemplate.query(sql, rowMapper);
        return result;
    }
    
}
