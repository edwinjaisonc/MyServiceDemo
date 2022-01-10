package com.example.cameraserviceinterface;

import com.example.cameraserviceinterface.ICameraListener;


import com.example.cameraserviceinterface.IServiceCameraInterface;
interface IBaseAidlInterface {


    /**
         * @brief Api to get sync connection
         */
    IServiceCameraInterface getSyncConnection();

     /**
         * @brief Api to register async connection
         */
    void registerAsyncConnection(ICameraListener mCameraListener);

    /**
         * @brief Api to unregister async connection
         */
    void unregisterAsyncConnection(ICameraListener mCameraListener);


}