package com.example.daggerfruitshop.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuditorShould {

    @Test
    public void declareNumberOfFruitInShop() {
        FruitShop shop = new FruitShop();
        shop.add(Fruit.ORANGE, 5);

        int numberOfFruit = new Auditor().count(shop);

        assertEquals(5, numberOfFruit);
    }

}
