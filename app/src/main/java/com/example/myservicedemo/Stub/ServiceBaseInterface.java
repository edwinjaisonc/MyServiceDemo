package com.example.myservicedemo.Stub;

import android.os.RemoteException;

import com.example.cameraserviceinterface.IBaseAidlInterface;
import com.example.cameraserviceinterface.ICameraListener;
import com.example.cameraserviceinterface.IServiceCameraInterface;
import com.example.myservicedemo.CameraAppServiceManager;


/**
 * @brief Base interface class which will act as a gateway for camera service and other apps.
 */
public class ServiceBaseInterface extends IBaseAidlInterface.Stub {


    /**
     * Member variable to store {@link CameraAppServiceManager} object.
     */
    private final CameraAppServiceManager mCameraAppServiceManager= CameraAppServiceManager.getCameraAppServiceManager();


    /**
     * @brief Api to register sync connection
     * @return IServiceCameraInterface: service camera interfaces object
     */
    @Override
    public IServiceCameraInterface getSyncConnection() throws RemoteException {
        return new ServiceCameraInterface();
    }


    /**
     * @brief Api to register async connection
     * @param mCameraListener : ICameraListener object
     */
    @Override
    public void registerAsyncConnection(ICameraListener mCameraListener) throws RemoteException {
        mCameraAppServiceManager.registerAsyncConnection(mCameraListener);


    }


    /**
     * @brief Api to unregister async connection
     * @param mCameraListener : ICameraListener object
     */
    @Override
    public void unregisterAsyncConnection(ICameraListener mCameraListener) throws RemoteException {
        mCameraAppServiceManager.unregisterAsyncConnection(mCameraListener);
    }
}
