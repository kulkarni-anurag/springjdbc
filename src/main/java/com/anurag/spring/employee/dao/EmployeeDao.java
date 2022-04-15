package com.anurag.spring.employee.dao;

import java.util.List;

import com.anurag.spring.employee.dto.Employee;

public interface EmployeeDao {
    int createRecord(Employee employee);
    int updateRecord(Employee employee);
    int deleteRecord(int id);
    Employee readRecord(int id);
    List<Employee> read();
}
