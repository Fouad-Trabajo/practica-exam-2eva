package com.iesam.carnejoven.features.user.domain;

public class SaveUserUseCase {

    private UserRepository userRepository;

    public SaveUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void execute(User user){
        userRepository.saveUser(user);
    }
}
