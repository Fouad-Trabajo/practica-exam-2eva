package com.iesam.carnejoven.features.promotions.presentation;

import com.iesam.carnejoven.features.promotions.data.PromotionDataRepository;
import com.iesam.carnejoven.features.promotions.data.local.PromotionFileDataSource;
import com.iesam.carnejoven.features.promotions.domain.*;

import java.util.ArrayList;

public class MainPromotion {
    public static void savePromotion(Promotion promotion) {
        PromotionFileDataSource promotionFileDataSource = PromotionFileDataSource.newInstance();
        PromotionDataRepository promotionDataRepository = new PromotionDataRepository(promotionFileDataSource);
        SavePromotionUseCase savePromotionUseCase = new SavePromotionUseCase(promotionDataRepository);
        savePromotionUseCase.execute(promotion);
    }

    public static void getPromotion(String id) {
        PromotionFileDataSource promotionFileDataSource = PromotionFileDataSource.newInstance();
        PromotionDataRepository promotionDataRepository = new PromotionDataRepository(promotionFileDataSource);
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(promotionDataRepository);
        Promotion promotion = getPromotionUseCase.execute(id);
        System.out.println(promotion.toString());
    }

    public static void getPromotions() {
        PromotionFileDataSource promotionFileDataSource = PromotionFileDataSource.newInstance();
        PromotionDataRepository promotionDataRepository = new PromotionDataRepository(promotionFileDataSource);
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(promotionDataRepository);
        ArrayList<Promotion> promotions = getPromotionsUseCase.execute();
        System.out.println(promotions.toString());
    }

    public static void deletePromotion(String id){
        PromotionFileDataSource promotionFileDataSource = PromotionFileDataSource.newInstance();
        PromotionDataRepository promotionDataRepository = new PromotionDataRepository(promotionFileDataSource);
        DeletePromotionUseCase deletePromotionUseCase = new DeletePromotionUseCase(promotionDataRepository);
        deletePromotionUseCase.execute(id);
    }


}
