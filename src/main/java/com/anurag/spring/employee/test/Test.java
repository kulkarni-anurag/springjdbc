package com.anurag.spring.employee.test;

import com.anurag.spring.employee.dao.EmployeeDao;
import com.anurag.spring.employee.dto.Employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/employee/test/config.xml");

        EmployeeDao dao = (EmployeeDao)ctx.getBean("employeeDao");

        /*Employee employee = new Employee();
        employee.setFirstname("MS");
        employee.setLastname("Dhoni");

        int result = dao.createRecord(employee);

        System.out.println("Number of records inserted: "+result);*/

        /*Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setFirstname("Ravindra");
        employee2.setLastname("Jadeja");

        int result2 = dao.updateRecord(employee2);

        System.out.println("Number of records updated: "+result2);*/

        int result3 = dao.deleteRecord(3);

        System.out.println("Number of Records deleted: "+result3);

        ctx.close();
    }
}
