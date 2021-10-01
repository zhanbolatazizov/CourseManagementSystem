package com.company;

public class Admin extends User{

    public Admin(String username, String password, String name, String surname) {
        super(username, password, name, surname);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username: '" + getUsername() + '\'' +
                ", password: '" + getPassword() + '\'' +
                "}";
    }
}
