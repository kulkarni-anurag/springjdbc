package com.anurag.spring.Friends.dao;

import java.util.List;

import com.anurag.spring.Friends.Friends;

public interface FriendsDao {
    int create(Friends friend);
    int update(Friends friend);
    int delete(int id);
    Friends read(int id);
    List<Friends> read();
}
