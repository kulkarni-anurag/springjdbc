package com.anurag.spring.cricketers;

public class Cricketers {
    private int id;
    private String firstname;
    private String lastname;

    public int getId() {
        return id;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cricketers [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }
}
