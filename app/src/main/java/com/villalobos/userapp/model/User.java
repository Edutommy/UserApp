package com.villalobos.userapp.model;

public class User {
    public String name;
    public String last;
    public String phone;
    public String email;
    public String thumbnail;

    public User() {
    }

    public User(String name, String last, String phone, String email, String thumbnail) {
        this.name = name;
        this.last = last;
        this.phone = phone;
        this.email = email;
        this.thumbnail = thumbnail;
    }
}
