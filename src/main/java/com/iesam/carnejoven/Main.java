package com.iesam.carnejoven;

import com.iesam.carnejoven.features.user.domain.User;
import com.iesam.carnejoven.features.user.presentation.MainUser;

public class Main {
    public static void main(String[] args) {

        User user = new User("@656","Roberto","Robledo",
                "C/Tomillares");
        User user2 = new User("@657","Marcos","Marmar",
                "C/Miramientos");
        //MainUser.saveUser(user);
        //MainUser.saveUser(user2);
        MainUser.getUser("@656");
    }
}