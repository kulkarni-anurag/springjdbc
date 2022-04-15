package com.anurag.spring.employee.dto;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }
}
