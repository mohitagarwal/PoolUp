package com.vehicle.poolup;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by mohit.tibrewal on 01/03/16.
 */
public class PoolUpApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
