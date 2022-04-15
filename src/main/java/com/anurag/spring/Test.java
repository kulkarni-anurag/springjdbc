package com.anurag.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/config.xml");

        JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");

        String sql = "INSERT INTO employee(firstname, lastname) values(?, ?)";

        int result = jdbcTemplate.update(sql, "Virat", "Kohli");

        System.out.println("Number of records inserted: "+result);

        ctx.close();
    }
}
