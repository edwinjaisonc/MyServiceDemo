// IServiceCameraInterface.aidl
package com.example.cameraserviceinterface;

// Declare any non-default types here with import statements

interface IServiceCameraInterface {

   String getPreviousActiveCamera();
   void startCamera();
   void setSetting(boolean status);
   void getSettings(int status);
}