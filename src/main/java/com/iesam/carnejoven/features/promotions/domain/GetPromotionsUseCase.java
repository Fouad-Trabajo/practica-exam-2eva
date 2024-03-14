package com.iesam.carnejoven.features.promotions.domain;

import java.util.ArrayList;

public class GetPromotionsUseCase {

    private PromotionRepository promotionRepository;


    public GetPromotionsUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }


    public ArrayList<Promotion> execute(){
        return promotionRepository.getPromotions();
    }
}
