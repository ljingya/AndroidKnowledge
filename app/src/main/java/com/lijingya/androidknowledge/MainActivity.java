package com.lijingya.androidknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.lijingya.androidknowledge.chapter01.Chapter01Activity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnChapter01 = findViewById(R.id.chapter01);
        btnChapter01.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.chapter01:
                intent.setClass(this, Chapter01Activity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
