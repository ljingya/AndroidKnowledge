package com.lijingya.androidknowledge.chapter01.broadccast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class CommonBroadcastReciver extends BroadcastReceiver {
    private String TAG = getClass().getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG,"onReceive");

    }
}
