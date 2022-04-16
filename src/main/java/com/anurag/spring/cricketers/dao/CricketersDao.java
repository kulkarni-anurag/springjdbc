package com.anurag.spring.cricketers.dao;

import com.anurag.spring.cricketers.Cricketers;

public interface CricketersDao {
    int create(Cricketers cricketer);
    int update(Cricketers cricketer);
    int delete(int id);
}
