package com.example.daggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Singleton
    @Provides
    static Driver provideDriver() {
        return new Driver();
    }
}
