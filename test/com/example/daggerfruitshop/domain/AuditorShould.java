package com.example.daggerfruitshop.domain;

import static org.junit.Assert.assertEquals;

import com.example.daggerfruitshop.domain.Auditor;
import com.example.daggerfruitshop.domain.Fruit;
import com.example.daggerfruitshop.domain.FruitShop;

import org.junit.Test;

public class AuditorShould {

    @Test
    public void declareNumberOfFruitInShop() {
        FruitShop shop = new FruitShop();
        shop.add(Fruit.ORANGE, 5);

        int numberOfFruit = new Auditor(shop).count();

        assertEquals(5, numberOfFruit);
    }

}
