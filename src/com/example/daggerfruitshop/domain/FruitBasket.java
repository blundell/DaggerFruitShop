package com.example.daggerfruitshop.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FruitBasket implements Iterable<Fruit> {

    private final List<Fruit> basket = new ArrayList<Fruit>();

    public void put(Fruit fruit) {
        basket.add(fruit);
    }

    @Override
    public Iterator<Fruit> iterator() {
        return basket.iterator();
    }

}
