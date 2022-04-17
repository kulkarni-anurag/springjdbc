package com.anurag.spring.Friends.test;

import com.anurag.spring.Friends.Friends;
import com.anurag.spring.Friends.dao.FriendsDao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/Friends/test/config.xml");

        FriendsDao dao = (FriendsDao)ctx.getBean("friendsDao");

        Friends friend = new Friends();
        friend.setFirstname("Yash");
        friend.setLastname("Kakad");

        int result1 = dao.create(friend);

        System.out.println("Number of records inserted: "+result1);

        ctx.close();
    }
}
