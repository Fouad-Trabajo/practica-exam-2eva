package com.iesam.carnejoven.features.user.domain;

public class User {

    public final String nif, name,surname, direcction;

    public User(String nif, String name, String surname, String direcction) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.direcction = direcction;
    }
}
