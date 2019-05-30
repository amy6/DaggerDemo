package com.example.daggerdemo;

import android.util.Log;

import javax.inject.Inject;

import dagger.Module;

@Module
public class DieselEngine implements Engine {

    private static final String TAG = "DieselEngine";

    @Inject
    public DieselEngine() {
    }

    @Override public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
