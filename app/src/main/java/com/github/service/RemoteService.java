package com.github.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 9/19 0019.
 */
public class RemoteService extends Service {

    private IRemoteService.Stub mIRemoteService = new IRemoteService.Stub() {
        @Override
        public String baseAidl() throws RemoteException {
            return "你好啊,我是小智!";
        }

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mIRemoteService.asBinder();
    }
}
