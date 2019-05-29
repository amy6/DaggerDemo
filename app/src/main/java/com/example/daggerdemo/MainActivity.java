package com.example.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Engine engine = new Engine();
        Wheels wheels = new Wheels();

        car = new Car(engine, wheels);
        car.drive();
    }
}
