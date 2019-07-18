package com.stackroute.springmvc;

public class User {
    private String username;
    private String password;

    public void User(){

    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
