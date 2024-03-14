package com.iesam.carnejoven.features.promotions.data;

import com.iesam.carnejoven.features.promotions.domain.Promotion;

public class StubPromotion {
    public static Promotion getPromotion(){
        return  new Promotion("@56","Rebajas",
                "Rebjas de semana santa","25%");
    }
}
