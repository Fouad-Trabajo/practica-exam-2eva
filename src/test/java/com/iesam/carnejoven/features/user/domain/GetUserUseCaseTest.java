package com.iesam.carnejoven.features.user.domain;

import com.iesam.carnejoven.features.user.data.StubUser;
import com.iesam.carnejoven.features.user.data.StubUserDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetUserUseCaseTest {

    private GetUserUseCase getUserUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getUserUseCase = null;
    }


    @Test
    public void cuandoEncuentroElUsuarioTodoOk() {
        //Given: declaración de variables
        String nif = "@112";
        User user = StubUser.getUser();
        getUserUseCase = new GetUserUseCase(new StubUserDataRepository());


        //When

        User result = getUserUseCase.execute(nif);


        //Then
        Assertions.assertEquals(user.nif, result.nif);
    }
}