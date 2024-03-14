package com.iesam.carnejoven.features.promotions.domain;

public class Promotion {

    public final String id, titlePromotion,description, discount;

    public Promotion(String id, String titlePromotion, String description, String discount) {
        this.id = id;
        this.titlePromotion = titlePromotion;
        this.description = description;
        this.discount = discount;
    }
}
