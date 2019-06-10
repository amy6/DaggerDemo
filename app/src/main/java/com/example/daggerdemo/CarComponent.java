package com.example.daggerdemo;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);


    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(int horsePower);

        CarComponent build();

    }
}
