package com.iesam.carnejoven.features.user.domain;

public class GetUserUseCase {
    private UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String nif){
        return userRepository.getUser(nif);
    }
}
