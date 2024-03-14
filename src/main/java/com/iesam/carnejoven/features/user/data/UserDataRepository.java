package com.iesam.carnejoven.features.user.data;

import com.iesam.carnejoven.features.user.data.local.UserFileDataSource;
import com.iesam.carnejoven.features.user.domain.User;
import com.iesam.carnejoven.features.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {

    private UserFileDataSource userFileDataSource;

    public UserDataRepository(UserFileDataSource userFileDataSource) {
        this.userFileDataSource = userFileDataSource;
    }

    @Override
    public void saveUser(User user) {
        userFileDataSource.save(user);

    }

    @Override
    public User getUser(String nif) {
        return userFileDataSource.findByNif(nif);
    }
}
