package com.vaibhavmojidra.puredependencyinjectionusingmethodsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.setBattery(new Battery());
        smartPhone.setMemoryCard(new MemoryCard());
        SimCard simCard=new SimCard();
        simCard.setServiceProvider(new ServiceProvider());
        smartPhone.setSimCard(simCard); //Injecting Dependency via methods
        smartPhone.startCallRecording();
    }
}