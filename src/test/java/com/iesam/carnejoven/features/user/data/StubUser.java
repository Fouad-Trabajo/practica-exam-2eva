package com.iesam.carnejoven.features.user.data;

import com.iesam.carnejoven.features.user.domain.User;

public class StubUser {

    public static User getUser(){
        return new User("@112","Roberto","Robledo",
                "C/Milan");
    }
}
