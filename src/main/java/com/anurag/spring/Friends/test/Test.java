package com.anurag.spring.Friends.test;

import java.util.List;

import com.anurag.spring.Friends.Friends;
import com.anurag.spring.Friends.dao.FriendsDao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/Friends/test/config.xml");

        FriendsDao dao = (FriendsDao)ctx.getBean("friendsDao");

        Friends friend = new Friends();
        friend.setFirstname("Suraj");
        friend.setLastname("Puri");

        //int result1 = dao.create(friend);

        //System.out.println("Number of records inserted: "+result1);

        Friends friend2 = new Friends();
        friend2.setId(1);
        friend2.setFirstname("Anil");
        friend2.setLastname("Kakad");

        //int result2 = dao.update(friend2);

        //System.out.println("Number of records updated: "+result2);

        //int result3 = dao.delete(4);

        //System.out.println("Number of records deleted: "+result3);

        //Friends result4 = dao.read(1);

        //System.out.println(result4);

        List<Friends> result5 = dao.read();

        System.out.println(result5);

        ctx.close();
    }
}
