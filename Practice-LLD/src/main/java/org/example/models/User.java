package org.example.models;

public class User {
    Integer id;
    String name;
    String gender;
    String phoneNumber;
    String pincode;
    Boolean loggedin;

    public User(String name, String gender, String phoneNumber, String pincode) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
        this.loggedin = false;
    }

    public Boolean getLoggedin() {
        return loggedin;
    }

    public User setLoggedin(Boolean loggedin) {
        this.loggedin = loggedin;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
