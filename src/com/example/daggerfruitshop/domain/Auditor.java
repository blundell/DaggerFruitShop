package com.example.daggerfruitshop.domain;

import javax.inject.Inject;

public class Auditor {

    @Inject
    public Auditor() {
    }

    public int count(FruitShop shop) {
        FruitBasket basket = shop.getFruit();

        int i = 0;
        for (Fruit fruit : basket) {
            i++;
        }
        return i;
    }

}
