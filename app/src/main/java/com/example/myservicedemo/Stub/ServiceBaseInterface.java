package com.example.myservicedemo.Stub;

import android.os.RemoteException;

import com.example.cameraserviceinterface.IBaseAidlInterface;
import com.example.cameraserviceinterface.ICameraListener;
import com.example.cameraserviceinterface.IServiceCameraInterface;
import com.example.myservicedemo.CameraAppServiceManager;

public class ServiceBaseInterface extends IBaseAidlInterface.Stub {
    private final CameraAppServiceManager mCameraAppServiceManager= CameraAppServiceManager.getCameraAppServiceManager();

    @Override
    public IServiceCameraInterface getSyncConnection() throws RemoteException {
        return new ServiceCameraInterface();
    }

    @Override
    public void registerAsyncConnection(ICameraListener mCameraListener) throws RemoteException {
        mCameraAppServiceManager.registerAsyncConnection(mCameraListener);


    }

    @Override
    public void unregisterAsyncConnection(ICameraListener mCameraListener) throws RemoteException {
        mCameraAppServiceManager.unregisterAsyncConnection(mCameraListener);
    }
}
