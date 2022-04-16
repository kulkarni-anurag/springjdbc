package com.anurag.spring.passenger.test;

import java.util.List;

import com.anurag.spring.passenger.Passenger;
import com.anurag.spring.passenger.dao.PassengerDao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/anurag/spring/passenger/test/config.xml");

        PassengerDao dao = (PassengerDao)ctx.getBean("passengerDao");

        Passenger passenger = new Passenger();
        passenger.setFirstName("Sachin");
        passenger.setLastName("Kulkarni");

        //int result = dao.create(passenger);

        //System.out.println("Number of records inserted: "+result);

        Passenger passenger2 = new Passenger();
        passenger2.setId(1);
        passenger2.setFirstName("Virat");
        passenger2.setLastName("Kohli");

        //int result2 = dao.update(passenger2);

        //System.out.println("Number of records updated: "+result2);

        //int result3 = dao.delete(1);

        //System.out.println("Number of records deleted: "+result3);

        //Passenger result4 = dao.read(2);

        //System.out.println(result4);

        List<Passenger> result5 = dao.read();

        System.out.println(result5);

        ctx.close();
    }
}
