package com.anurag.spring.employee.test;

import com.anurag.spring.employee.dao.EmployeeDao;
import com.anurag.spring.employee.dto.Employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/employee/test/config.xml");

        EmployeeDao dao = (EmployeeDao)ctx.getBean("employeeDao");

        Employee employee = new Employee();
        employee.setFirstname("MS");
        employee.setLastname("Dhoni");

        int result = dao.createRecord(employee);

        System.out.println("Number of records inserted: "+result);

        ctx.close();
    }
}
