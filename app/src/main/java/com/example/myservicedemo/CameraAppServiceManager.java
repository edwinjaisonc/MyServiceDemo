package com.example.myservicedemo;

public class CameraAppServiceManager {

    private static final CameraAppServiceManager CAMERA_APP_SERVICE_MANAGER = new
            CameraAppServiceManager();

    /**
     * @brief Method to get singleton object of this class
     * @return CameraAppServiceManager: singleton object of this class
     */
    public static CameraAppServiceManager getCameraAppServiceManager() {
        return CAMERA_APP_SERVICE_MANAGER;
    }

    public String getPreviousActiveCamera() {
        return "Rear View Camera";
    }
}
