package com.iesam.carnejoven.features.user.data;

import com.iesam.carnejoven.features.user.domain.User;
import com.iesam.carnejoven.features.user.domain.UserRepository;

public class StubUserDataRepository implements UserRepository {
    @Override
    public void saveUser(User user) {

    }

    @Override
    public User getUser(String nif) {
        User user = StubUser.getUser();
        if(user.nif.equals(nif)){
            return user;
        }
        return null;
    }
}
