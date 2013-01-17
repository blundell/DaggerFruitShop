package com.example.daggerfruitshop.domain;

import javax.inject.Inject;

public class Auditor {

    private final FruitShop shop;

    @Inject
    public Auditor(FruitShop shop) {
        this.shop = shop;
    }

    public int count() {
        FruitBasket basket = shop.getFruit();

        int i = 0;
        for (Fruit fruit : basket) {
            i++;
        }
        return i;
    }

}
