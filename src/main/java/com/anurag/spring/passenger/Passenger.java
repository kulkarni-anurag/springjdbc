package com.anurag.spring.passenger;

public class Passenger {
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
