// IBaseAidlInterface.aidl
package com.example.cameraserviceinterface;

// Declare any non-default types here with import statements
import com.example.cameraserviceinterface.ICameraListener;


import com.example.cameraserviceinterface.IServiceCameraInterface;
interface IBaseAidlInterface {

    IServiceCameraInterface getSyncConnection();
    void registerAsyncConnection(ICameraListener mCameraListener);
    void unregisterAsyncConnection(ICameraListener mCameraListener);


}