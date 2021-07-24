package com.vaibhavmojidra.puredependencyinjectionusingmethodsjava;

import android.util.Log;

public class SimCard {
    private ServiceProvider serviceProvider;

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
        Log.i("MyInfo","ServiceProvider initialize via method");
    }

    public void getConnected(){
        serviceProvider.getServiceProvider();
        Log.i("MyInfo","Connected to network");
    }
}
