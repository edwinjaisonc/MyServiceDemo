package com.example.cameraserviceinterface;


interface ICameraListener {

            /**
                 * @brief Method to notify camera status.
                 * @param status : status of camera.
                 */
            void notifyCameraStatus(boolean status);

}