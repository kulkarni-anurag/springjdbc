package com.anurag.spring.cricketers.test;

import java.util.List;

import com.anurag.spring.cricketers.Cricketers;
import com.anurag.spring.cricketers.dao.CricketersDao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/cricketers/test/config.xml");

        CricketersDao dao = (CricketersDao)ctx.getBean("cricketersDao");

        Cricketers cricketer = new Cricketers();
        cricketer.setFirstname("Rishab");
        cricketer.setLastname("Pant");

        int result1 = dao.create(cricketer);

        System.out.println("Number of records inserted: "+result1);

        Cricketers cricketer2 = new Cricketers();
        cricketer2.setId(1);
        cricketer2.setFirstname("MS");
        cricketer2.setLastname("Dhoni");

        //int result2 = dao.update(cricketer2);

        //System.out.println("Number of records updated: "+result2);

        //int result3 = dao.delete(2);

        //System.out.println("Number of records deleted: "+result3);

        //Cricketers result4 = dao.read(3);

        //System.out.println(result4);

        List<Cricketers> result5 = dao.read();

        System.out.println(result5);

        ctx.close();
    }
}
