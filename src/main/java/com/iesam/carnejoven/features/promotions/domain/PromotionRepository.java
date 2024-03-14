package com.iesam.carnejoven.features.promotions.domain;

import java.util.ArrayList;

public interface PromotionRepository {
    void savePromotion(Promotion promotion);

    Promotion getPromotion(String id);

    ArrayList<Promotion> getPromotions();

    void deletePromotion(String id);
}
