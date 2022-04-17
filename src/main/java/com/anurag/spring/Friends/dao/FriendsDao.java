package com.anurag.spring.Friends.dao;

import com.anurag.spring.Friends.Friends;

public interface FriendsDao {
    int create(Friends friend);
    int update(Friends friend);
}
