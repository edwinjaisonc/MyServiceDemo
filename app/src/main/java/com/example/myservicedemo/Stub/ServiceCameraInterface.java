package com.example.myservicedemo.Stub;

import android.os.RemoteException;

import com.example.cameraserviceinterface.IServiceCameraInterface;
import com.example.myservicedemo.CameraAppServiceManager;

public class ServiceCameraInterface extends IServiceCameraInterface.Stub {

    private final CameraAppServiceManager mCameraAppServiceManager =
            CameraAppServiceManager.getCameraAppServiceManager();


    @Override
    public String getPreviousActiveCamera() throws RemoteException {
        return mCameraAppServiceManager.getPreviousActiveCamera();
    }

    @Override
    public void startCamera() throws RemoteException {
        mCameraAppServiceManager.startCamera();
    }

    @Override
    public void setSetting(boolean status) throws RemoteException {
        mCameraAppServiceManager.setSetting(status);
    }

    @Override
    public void getSettings(int status) throws RemoteException {
        mCameraAppServiceManager.getSettings(status);
    }


}
