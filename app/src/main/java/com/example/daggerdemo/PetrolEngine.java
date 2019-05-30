package com.example.daggerdemo;

import android.util.Log;

import javax.inject.Inject;

import dagger.Module;

@Module
public class PetrolEngine implements Engine {

    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {
    }

    @Override public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}
