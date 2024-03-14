package com.iesam.carnejoven.features.promotions.data;

import com.iesam.carnejoven.features.promotions.data.local.PromotionFileDataSource;
import com.iesam.carnejoven.features.promotions.domain.Promotion;
import com.iesam.carnejoven.features.promotions.domain.PromotionRepository;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {

    //Instancia de fichero local
    private PromotionFileDataSource promotionFileDataSource;

    public PromotionDataRepository(PromotionFileDataSource promotionFileDataSource) {
        this.promotionFileDataSource = promotionFileDataSource;
    }

    @Override
    public void savePromotion(Promotion promotion) {
        promotionFileDataSource.save(promotion);

    }

    @Override
    public Promotion getPromotion(String id) {
        return promotionFileDataSource.findById(id);
    }

    @Override
    public ArrayList<Promotion> getPromotions() {
        return (ArrayList<Promotion>) promotionFileDataSource.findAll();
    }

    @Override
    public void deletePromotion(String id) {
        promotionFileDataSource.delete(id);
    }
}
