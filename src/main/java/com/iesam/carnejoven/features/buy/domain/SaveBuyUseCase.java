package com.iesam.carnejoven.features.buy.domain;

public class SaveBuyUseCase {
    private BuyRepository buyRepository;

    public SaveBuyUseCase(BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public void execute(Buy buy){
        buyRepository.saveBuy(buy);
    }
}
