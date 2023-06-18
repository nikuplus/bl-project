package com.example.application.resource;

public class User {
    private String name;
    private String age;
    private String sex;

    public User(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }
}
