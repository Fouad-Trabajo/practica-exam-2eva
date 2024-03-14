package com.iesam.carnejoven.features.promotions.domain;

public class DeletePromotionUseCase {

    private PromotionRepository promotionRepository;

    public DeletePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public void execute(String id){
        promotionRepository.deletePromotion(id);
    }
}
