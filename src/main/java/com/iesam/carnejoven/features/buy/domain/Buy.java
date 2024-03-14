package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.promotions.domain.Promotion;
import com.iesam.carnejoven.features.user.domain.User;

public class Buy {
    public final String id, dateBuy;
    public Promotion promotion;
    public User user;

    public Buy(String id, String dateBuy, Promotion promotion, User user) {
        this.id = id;
        this.dateBuy = dateBuy;
        this.promotion = promotion;
        this.user = user;
    }
}
