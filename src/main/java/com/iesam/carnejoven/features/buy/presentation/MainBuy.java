package com.iesam.carnejoven.features.buy.presentation;

import com.iesam.carnejoven.features.buy.data.BuyDataRepository;
import com.iesam.carnejoven.features.buy.data.local.BuyFileDataSource;
import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.buy.domain.GetBuysUseCase;
import com.iesam.carnejoven.features.buy.domain.SaveBuyUseCase;

import java.util.ArrayList;

public class MainBuy {

    public static void saveBuy(Buy buy){
        BuyFileDataSource buyFileDataSource = BuyFileDataSource.newInstance();
        BuyDataRepository buyDataRepository = new BuyDataRepository(buyFileDataSource);
        SaveBuyUseCase saveBuyUseCase = new SaveBuyUseCase(buyDataRepository);
        saveBuyUseCase.execute(buy);
    }

    public static void getBuys(){
        BuyFileDataSource buyFileDataSource = BuyFileDataSource.newInstance();
        BuyDataRepository buyDataRepository = new BuyDataRepository(buyFileDataSource);
        GetBuysUseCase getBuysUseCase = new GetBuysUseCase(buyDataRepository);
        ArrayList<Buy> buy = getBuysUseCase.execute();
        System.out.println(buy.toString());
    }
}
