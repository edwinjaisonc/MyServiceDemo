package com.example.myservicedemo.Stub;

import android.os.RemoteException;

import com.example.cameraserviceinterface.IServiceCameraInterface;
import com.example.myservicedemo.CameraAppServiceManager;

public class ServiceCameraInterface extends IServiceCameraInterface.Stub {


    /**
     * Member variable to store {@link CameraAppServiceManager} object.
     */
    private final CameraAppServiceManager mCameraAppServiceManager =
            CameraAppServiceManager.getCameraAppServiceManager();



    /**
     * @brief Method to get previous active camera
     * @return camera : camera
     */
    @Override
    public String getPreviousActiveCamera() throws RemoteException {
        return mCameraAppServiceManager.getPreviousActiveCamera();
    }


    /**
     * @brief Method to start camera
     */
    @Override
    public void startCamera() throws RemoteException {
        mCameraAppServiceManager.startCamera();
    }


    /**
     * @brief Method to set the value of settings
     * @param status:status of the settings
     */
    @Override
    public void setSetting(boolean status) throws RemoteException {
        mCameraAppServiceManager.setSetting(status);
    }

    /**
     * @brief Method to get the value of settings
     * @param status:status of the settings
     */
    @Override
    public void getSettings(int status) throws RemoteException {
        mCameraAppServiceManager.getSettings(status);
    }


}
