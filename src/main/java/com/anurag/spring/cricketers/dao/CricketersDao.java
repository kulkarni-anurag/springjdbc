package com.anurag.spring.cricketers.dao;

import java.util.List;

import com.anurag.spring.cricketers.Cricketers;

public interface CricketersDao {
    int create(Cricketers cricketer);
    int update(Cricketers cricketer);
    int delete(int id);
    Cricketers read(int id);
    List<Cricketers> read();
}
