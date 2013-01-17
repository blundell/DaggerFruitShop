package com.example.daggerfruitshop.domain;

import javax.inject.Inject;

public class FruitShop {

    private final FruitBasket fruitBasket;

    @Inject
    public FruitShop() {
        fruitBasket = new FruitBasket();
    }

    public void add(Fruit fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruitBasket.put(fruit);
        }
    }

    protected FruitBasket getFruit() {
        return fruitBasket;
    }
}
