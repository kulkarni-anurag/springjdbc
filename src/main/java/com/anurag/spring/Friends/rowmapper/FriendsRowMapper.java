package com.anurag.spring.Friends.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.anurag.spring.Friends.Friends;

import org.springframework.jdbc.core.RowMapper;

public class FriendsRowMapper implements RowMapper<Friends> {

    @Override
    public Friends mapRow(ResultSet rs, int rowNum) throws SQLException {
        Friends friend = new Friends();
        friend.setId(rs.getInt(1));
        friend.setFirstname(rs.getString(2));
        friend.setLastname(rs.getString(3));
        
        return friend;
    }
    
}
