package com.example.myservicedemo;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;

import com.example.cameraserviceinterface.ICameraListener;
import static com.example.cameraserviceinterface.constants.CameraHmiServiceConstants.TAG;

import java.util.HashMap;

public class CameraAppServiceManager {
    private final RemoteCallbackList<ICameraListener> mCameraNoticationCallbackList = new RemoteCallbackList<>();
    private Handler mHandler = new Handler();
    private boolean mCameraStatus;
    SharedPreferences sh;

    private static final CameraAppServiceManager CAMERA_APP_SERVICE_MANAGER = new
            CameraAppServiceManager();


    /**
     * @return CameraAppServiceManager: singleton object of this class
     * @brief Method to get singleton object of this class
     */
    public static CameraAppServiceManager getCameraAppServiceManager() {
        return CAMERA_APP_SERVICE_MANAGER;
    }

    private ICameraListener mCameraListener = new ICameraListener.Stub() {

        @Override
        public void notifyCameraStatus(boolean status) throws RemoteException {
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    Log.d(TAG, "Inside notifyCameraStatus:" + mCameraStatus);
                    int broadcastCount = mCameraNoticationCallbackList.beginBroadcast();
                    /**
                     * This for loop iterates through number of application bind to service
                     */
                    try {
                        for (int i = 0; i < broadcastCount; i++) {
                            mCameraNoticationCallbackList.getBroadcastItem(i)
                                    .notifyCameraStatus(mCameraStatus);
                        }
                    } catch (RemoteException e) {
                        Log.e(TAG, "notifyCameraStatus " + e);
                    } finally {
                        mCameraNoticationCallbackList.finishBroadcast();
                    }
                }

            });
        }
    };

    public String getPreviousActiveCamera() {
        return "Rear View Camera";
    }

    public void registerAsyncConnection(ICameraListener mCameraListener) {
        mCameraNoticationCallbackList.register(mCameraListener);
    }

    public void unregisterAsyncConnection(ICameraListener mCameraListener) {
        mCameraNoticationCallbackList.unregister(mCameraListener);
    }

    public void startCamera() throws RemoteException{
        mCameraStatus = !mCameraStatus;
        mCameraListener.notifyCameraStatus(mCameraStatus);
    }

    private HashMap<Integer,Boolean> hashMap = new HashMap<Integer,Boolean>();
    public void setSetting(boolean status){

        hashMap.put(1,status);
        getSettings(1);

    }

    public Boolean getSettings(int key){
        Log.d("setting status","status");
        return hashMap.get(key);
    }
}


