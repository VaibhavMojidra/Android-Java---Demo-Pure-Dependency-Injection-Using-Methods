package com.vaibhavmojidra.puredependencyinjectionusingmethodsjava;

import android.util.Log;

public class SmartPhone {
    private Battery battery;
    private MemoryCard memoryCard;
    private SimCard simCard;

    public void setBattery(Battery battery) {
        this.battery = battery;
        Log.i("MyInfo","Battery initialize via method");
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
        Log.i("MyInfo","MemoryCard initialize via method");
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
        Log.i("MyInfo","SimCard initialize via method");
    }

    public void startCallRecording(){
        battery.getBattery();
        memoryCard.getSpace();
        simCard.getConnected();
        Log.i("MyInfo","Started Recording...");
    }
}
