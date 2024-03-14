package com.iesam.carnejoven.features.promotions.domain;

public class GetPromotionUseCase {

    private PromotionRepository promotionRepository;

    public GetPromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public Promotion execute(String id){
        return promotionRepository.getPromotion(id);
    }
}
