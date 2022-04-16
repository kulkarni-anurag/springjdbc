package com.anurag.spring.cricketers.test;

import com.anurag.spring.cricketers.Cricketers;
import com.anurag.spring.cricketers.dao.CricketersDao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/cricketers/test/config.xml");

        CricketersDao dao = (CricketersDao)ctx.getBean("cricketersDao");

        Cricketers cricketer = new Cricketers();
        cricketer.setFirstname("Virat");
        cricketer.setLastname("Kohli");

        int result1 = dao.create(cricketer);

        System.out.println("Number of records inserted: "+result1);

        ctx.close();
    }
}
