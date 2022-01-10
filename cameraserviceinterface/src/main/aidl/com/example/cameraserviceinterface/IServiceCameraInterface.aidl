package com.example.cameraserviceinterface;


interface IServiceCameraInterface {



   /**
        * @brief Method to get previous active camera
        * @return camera : camera
        */
   String getPreviousActiveCamera();

   /**
        * @brief Method to start camera
        */
   void startCamera();


   void setSetting(boolean status);
   void getSettings(int status);
}