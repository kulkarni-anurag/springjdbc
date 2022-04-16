package com.anurag.spring.passenger.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.anurag.spring.passenger.Passenger;

import org.springframework.jdbc.core.RowMapper;

public class PassengerRowMapper implements RowMapper<Passenger> {

    @Override
    public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
        Passenger psg = new Passenger();
        psg.setId(rs.getInt(1));
        psg.setFirstName(rs.getString(2));
        psg.setLastName(rs.getString(3));
        return psg;
    }
    
}
