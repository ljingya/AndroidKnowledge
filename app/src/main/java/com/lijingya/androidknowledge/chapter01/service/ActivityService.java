package com.lijingya.androidknowledge.chapter01.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lijingya.androidknowledge.R;

public class ActivityService extends AppCompatActivity implements View.OnClickListener {
private ServiceConnection connection=new ServiceConnection() {
    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {

    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }
};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_service);
        findViewById(R.id.btn_start_service).setOnClickListener(this);
        findViewById(R.id.btn_stop_service).setOnClickListener(this);
        findViewById(R.id.btn_bind_service).setOnClickListener(this);
        findViewById(R.id.btn_unbind_service).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ServiceKg.class);
        switch (v.getId()){
            case R.id.btn_start_service:
                startService(intent);
                break;
            case R.id.btn_stop_service:
                stopService(intent);
                break;
            case R.id.btn_bind_service:
                bindService(intent,connection,Service.BIND_AUTO_CREATE);
                break;
            case R.id.btn_unbind_service:
                unbindService(connection);
                break;

        }
    }
}
