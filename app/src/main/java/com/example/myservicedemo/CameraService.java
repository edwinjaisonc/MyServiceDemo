package com.example.myservicedemo;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.myservicedemo.Stub.ServiceBaseInterface;

public class CameraService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

//        Log.d("CameraService","OnBind");
        return new ServiceBaseInterface();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("CameraService", "OnStart");
        return Service.START_STICKY;
    }
}
