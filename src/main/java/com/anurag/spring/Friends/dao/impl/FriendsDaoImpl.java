package com.anurag.spring.Friends.dao.impl;

import com.anurag.spring.Friends.Friends;
import com.anurag.spring.Friends.dao.FriendsDao;

import org.springframework.jdbc.core.JdbcTemplate;

public class FriendsDaoImpl implements FriendsDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(Friends friend) {
        String sql = "INSERT INTO friends (firstname, lastname) values (?, ?)";
        int result = jdbcTemplate.update(sql, friend.getFirstname(), friend.getLastname());
        return result;
    }

    @Override
    public int update(Friends friend) {
        String sql = "UPDATE friends SET firstname = ?, lastname = ? WHERE id = ?";
        int result = jdbcTemplate.update(sql, friend.getFirstname(), friend.getLastname(), friend.getId());
        return result;
    }
}
