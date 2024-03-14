package com.iesam.carnejoven.features.promotions.data;

import com.iesam.carnejoven.features.promotions.domain.Promotion;
import com.iesam.carnejoven.features.promotions.domain.PromotionRepository;

import java.util.ArrayList;

public class StubPromotionsDataRepostiroy implements PromotionRepository {
    @Override
    public void savePromotion(Promotion promotion) {

    }

    @Override
    public Promotion getPromotion(String id) {
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
