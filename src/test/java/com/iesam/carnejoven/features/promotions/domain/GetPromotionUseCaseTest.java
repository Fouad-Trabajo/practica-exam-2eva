package com.iesam.carnejoven.features.promotions.domain;

import com.iesam.carnejoven.features.promotions.data.StubPromotion;
import com.iesam.carnejoven.features.promotions.data.StubPromotionDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetPromotionUseCaseTest {
    private GetPromotionUseCase getPromotionUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getPromotionUseCase = null;
    }

    @Test
    public void cuandoEncuentroLaPromotionTodoEstaOk() {
        //Given: declaración de variables que voy a usar
        String id="@56";
        Promotion promotion = StubPromotion.getPromotion();
        getPromotionUseCase = new GetPromotionUseCase(new StubPromotionDataRepository());



        //When
        Promotion result = getPromotionUseCase.execute(id);

        //Then
        Assertions.assertEquals(promotion.id, result.id);
    }
}