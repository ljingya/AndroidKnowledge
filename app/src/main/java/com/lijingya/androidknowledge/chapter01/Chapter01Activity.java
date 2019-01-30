package com.lijingya.androidknowledge.chapter01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.lijingya.androidknowledge.R;
import com.lijingya.androidknowledge.chapter01.fragment.FragmentKgAct;

/**
 * @author lijingya
 * @description 添加描述
 * @email lijingya@91118.com
 * @createDate 2019/1/30
 * @company 杭州天音
 */
public class Chapter01Activity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_chapter01);
        findViewById(R.id.fragment).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.fragment:
                intent.setClass(this, FragmentKgAct.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
