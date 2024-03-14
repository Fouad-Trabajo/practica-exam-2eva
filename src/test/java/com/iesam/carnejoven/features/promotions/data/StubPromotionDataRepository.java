package com.iesam.carnejoven.features.promotions.data;

import com.iesam.carnejoven.features.promotions.domain.Promotion;
import com.iesam.carnejoven.features.promotions.domain.PromotionRepository;

import java.util.ArrayList;

public class StubPromotionDataRepository implements PromotionRepository {
    @Override
    public void savePromotion(Promotion promotion) {

    }

    @Override
    public Promotion getPromotion(String id) {
        Promotion promotion = StubPromotion.getPromotion();
        if (promotion.id.equals(id)) {
            return promotion;
        }
        return null;
    }

    @Override
    public ArrayList<Promotion> getPromotions() {
        return null;
    }

    @Override
    public void deletePromotion(String id) {

    }
}
