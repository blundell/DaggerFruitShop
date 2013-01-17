package com.example.daggerfruitshop;

import android.app.Application;
import android.util.Log;

import dagger.ObjectGraph;

public class FruitShopApplication extends Application {

    private ObjectGraph dagger;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Sanity", "on create of dagger fruit shop app");

        dagger = ObjectGraph.create(addModules());
    }

    private Object[] addModules() {
        return new Object[] {new MainActivityModule()};
    }

    public ObjectGraph getInjectionFramework() {
        return dagger;
    }

}
