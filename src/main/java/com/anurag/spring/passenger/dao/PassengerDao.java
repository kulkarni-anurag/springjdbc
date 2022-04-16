package com.anurag.spring.passenger.dao;

import com.anurag.spring.passenger.Passenger;

public interface PassengerDao {
    int create(Passenger passenger);
    int update(Passenger passenger);
    int delete(int id);
}
