package com.lijingya.androidknowledge.chapter01.broadccast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lijingya.androidknowledge.R;

public class ReciveBroadcastAct  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_reciver_broad_cast);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
