package com.anurag.spring.Friends.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/Friends/test/config.xml");

        

        ctx.close();
    }
}
