package com.anurag.spring.cricketers.dao.impl;

import com.anurag.spring.cricketers.Cricketers;
import com.anurag.spring.cricketers.dao.CricketersDao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CricketersDaoImpl implements CricketersDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(Cricketers cricketer) {
        String sql = "INSERT INTO cricketers(firstname, lastname) values (?, ?)";
        int result = jdbcTemplate.update(sql, cricketer.getFirstname(), cricketer.getLastname());
        return result;
    }

    @Override
    public int update(Cricketers cricketer) {
        String sql = "UPDATE cricketers SET firstname = ?, lastname = ? WHERE id = ?";
        int result = jdbcTemplate.update(sql, cricketer.getFirstname(), cricketer.getLastname(), cricketer.getId());
        return result;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM cricketers WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }
    
}
