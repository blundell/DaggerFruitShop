package com.example.daggerfruitshop.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daggerfruitshop.FruitShopApplication;
import com.example.daggerfruitshop.R;
import com.example.daggerfruitshop.domain.Auditor;
import com.example.daggerfruitshop.domain.Fruit;
import com.example.daggerfruitshop.domain.FruitShop;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    private FruitShop fruitShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inject();

        fruitShop.add(Fruit.ORANGE, 3);

        TextView numberOfFruitTextView = (TextView) findViewById(R.id.main_tv_fruit_count);

        numberOfFruitTextView.setText("Shop Fruit Count: " + new Auditor(fruitShop).count());
    }

    private void inject() {
        ((FruitShopApplication) getApplication()).getInjectionFramework().inject(this);
    }

}
