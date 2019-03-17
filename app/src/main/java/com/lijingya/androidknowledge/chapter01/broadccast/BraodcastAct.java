package com.lijingya.androidknowledge.chapter01.broadccast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lijingya.androidknowledge.R;

public class BraodcastAct extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_broad_cast);
        findViewById(R.id.btn_send_cast).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_send_cast:

                break;
        }
    }
}
