package com.anurag.spring.employee.dao.impl;

import com.anurag.spring.employee.dao.EmployeeDao;
import com.anurag.spring.employee.dto.Employee;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int createRecord(Employee employee) {
        String sql = "INSERT INTO employee(firstname, lastname) values(?, ?)";
        int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname());
        
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int updateRecord(Employee employee) {
        String sql = "UPDATE employee SET firstname = ?, lastname = ? WHERE id = ?";
        int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
        
        return result;
    }
    
}
