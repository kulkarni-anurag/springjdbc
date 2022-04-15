package com.anurag.spring.employee.dao.impl;

import java.util.List;

import com.anurag.spring.employee.dao.EmployeeDao;
import com.anurag.spring.employee.dao.rowmapper.EmployeeRowMapper;
import com.anurag.spring.employee.dto.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
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

    @Override
    public int deleteRecord(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        int result = jdbcTemplate.update(sql, id);

        return result;
    }

    @Override
    public Employee readRecord(int id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        EmployeeRowMapper rowmapper = new EmployeeRowMapper();
        Employee employee = jdbcTemplate.queryForObject(sql, rowmapper, id);
        return employee;
    }

    @Override
    public List<Employee> read() {
        String sql = "SELECT * FROM employee";
        EmployeeRowMapper rowmapper = new EmployeeRowMapper();
        List<Employee> result = jdbcTemplate.query(sql, rowmapper);
        return result;
    }
    
}
