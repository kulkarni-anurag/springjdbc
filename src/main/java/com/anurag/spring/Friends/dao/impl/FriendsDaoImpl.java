package com.anurag.spring.Friends.dao.impl;

import java.util.List;

import com.anurag.spring.Friends.Friends;
import com.anurag.spring.Friends.dao.FriendsDao;
import com.anurag.spring.Friends.rowmapper.FriendsRowMapper;

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

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM friends WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public Friends read(int id) {
        String sql = "SELECT * FROM friends WHERE id = ?";
        FriendsRowMapper rowMapper = new FriendsRowMapper();
        Friends friend = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return friend;
    }

    @Override
    public List<Friends> read() {
        String sql = "SELECT * FROM friends";
        FriendsRowMapper rowMapper = new FriendsRowMapper();
        List<Friends> friends = jdbcTemplate.query(sql, rowMapper);
        return friends;
    }
}
