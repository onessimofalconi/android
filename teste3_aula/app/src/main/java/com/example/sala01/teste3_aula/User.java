package com.example.sala01.teste3_aula;

/**
 * Created by sala01 on 11/05/2017.
 */

public class User {

    private String name;
    private String description;

    public User(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}