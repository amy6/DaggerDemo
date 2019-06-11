package com.example.daggerdemo;

import android.app.Application;

public class ExampleApp extends Application {

    private CarComponent component;

    @Override public void onCreate() {
        super.onCreate();

        component = DaggerCarComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .build();
    }

    public CarComponent getAppComponent() {
        return component;
    }
}
