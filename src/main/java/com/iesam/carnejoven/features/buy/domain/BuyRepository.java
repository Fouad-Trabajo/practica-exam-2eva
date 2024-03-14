package com.iesam.carnejoven.features.buy.domain;

import java.util.ArrayList;

public interface BuyRepository {
    void saveBuy(Buy buy);

    ArrayList<Buy> getBuys();
}
