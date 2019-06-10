package com.example.daggerdemo;

import android.util.Log;

import javax.inject.Inject;

import dagger.Module;

@Module
public class DieselEngine implements Engine {

    private static final String TAG = "DieselEngine";

    private final int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower : " + horsePower);
    }
}
