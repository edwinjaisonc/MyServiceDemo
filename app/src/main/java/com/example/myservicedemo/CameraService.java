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


        return new ServiceBaseInterface();

    }
    /**
     * @brief This function is called when service starts.
     * @param intent : The Intent supplied to startService(Intent)
     * @param flags : Additional data about this start request
     * @param startId : A unique integer representing this specific request to start
     * @return int : The return value indicates what semantics the system should use for the
     *         service's
     */

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("CameraService", "OnStart");
        return Service.START_STICKY;
    }
}
