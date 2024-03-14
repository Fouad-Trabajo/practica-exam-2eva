package com.iesam.carnejoven.features.buy.data;

import com.iesam.carnejoven.features.buy.data.local.BuyFileDataSource;
import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.buy.domain.BuyRepository;

import java.util.ArrayList;

public class BuyDataRepository implements BuyRepository {

    private BuyFileDataSource buyFileDataSource;

    public BuyDataRepository(BuyFileDataSource buyFileDataSource) {
        this.buyFileDataSource = buyFileDataSource;
    }

    @Override
    public void saveBuy(Buy buy) {
        buyFileDataSource.save(buy);
    }

    @Override
    public ArrayList<Buy> getBuys() {
        return (ArrayList<Buy>) buyFileDataSource.findAll();
    }
}
