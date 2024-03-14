package com.iesam.carnejoven.features.user.presentation;

import com.iesam.carnejoven.features.user.data.UserDataRepository;
import com.iesam.carnejoven.features.user.data.local.UserFileDataSource;
import com.iesam.carnejoven.features.user.domain.SaveUserUseCase;
import com.iesam.carnejoven.features.user.domain.User;

public class MainUser {

    public static void saveUser(User user){
        UserFileDataSource userFileDataSource = UserFileDataSource.newInstance();
        UserDataRepository userDataRepository = new UserDataRepository(userFileDataSource);
        SaveUserUseCase saveUserUseCase = new SaveUserUseCase(userDataRepository);
        saveUserUseCase.execute(user);
    }

    public static void getUser(String nif){
        UserFileDataSource userFileDataSource = UserFileDataSource.newInstance();
        UserDataRepository userDataRepository = new UserDataRepository(userFileDataSource);
        User user = userDataRepository.getUser(nif);
        System.out.println(user.toString());
    }
}
