package com.example.myservicedemo.Stub;

import android.os.RemoteException;

import com.example.cameraserviceinterface.IBaseAidlInterface;
import com.example.cameraserviceinterface.IServiceCameraInterface;

public class ServiceBaseInterface extends IBaseAidlInterface.Stub {

    @Override
    public IServiceCameraInterface getSyncConnection() throws RemoteException {
        return new ServiceCameraInterface();
    }
}
