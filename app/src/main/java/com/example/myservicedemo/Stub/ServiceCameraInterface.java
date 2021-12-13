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
}
