package com.anurag.spring.cricketers.dao.impl;

import java.util.List;

import com.anurag.spring.cricketers.Cricketers;
import com.anurag.spring.cricketers.dao.CricketersDao;
import com.anurag.spring.cricketers.rowmapper.CricketersRowMapper;

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

    @Override
    public Cricketers read(int id) {
        String sql = "SELECT * FROM cricketers WHERE id = ?";
        CricketersRowMapper rowMapper = new CricketersRowMapper();
        Cricketers cricketer = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return cricketer;
    }

    @Override
    public List<Cricketers> read() {
        String sql = "SELECT * FROM cricketers";
        CricketersRowMapper rowMapper = new CricketersRowMapper();
        List<Cricketers> result = jdbcTemplate.query(sql, rowMapper);
        return result;
    }
    
}
