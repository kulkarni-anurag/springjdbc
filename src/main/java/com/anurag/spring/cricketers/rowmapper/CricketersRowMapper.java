package com.anurag.spring.cricketers.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.anurag.spring.cricketers.Cricketers;

import org.springframework.jdbc.core.RowMapper;

public class CricketersRowMapper implements RowMapper<Cricketers> {

    @Override
    public Cricketers mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cricketers cricketer = new Cricketers();
        cricketer.setId(rs.getInt(1));
        cricketer.setFirstname(rs.getString(2));
        cricketer.setLastname(rs.getString(3));
        return cricketer;
    }
    
}
