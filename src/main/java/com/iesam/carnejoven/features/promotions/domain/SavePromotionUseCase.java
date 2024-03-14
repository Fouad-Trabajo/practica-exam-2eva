package com.iesam.carnejoven.features.promotions.domain;

public class SavePromotionUseCase {

    private PromotionRepository promotionRepository;

    public SavePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public void execute(Promotion promotion){
        promotionRepository.savePromotion(promotion);
    }
}
