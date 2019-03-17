package com.lijingya.androidknowledge.chapter01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.lijingya.androidknowledge.R;
import com.lijingya.androidknowledge.chapter01.broadccast.BraodcastAct;
import com.lijingya.androidknowledge.chapter01.fragment.FragmentKgAct;
import com.lijingya.androidknowledge.chapter01.service.ActivityService;
import com.lijingya.androidknowledge.chapter01.service.ServiceKg;

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
        findViewById(R.id.service).setOnClickListener(this);
        findViewById(R.id.broadcast).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fragment:
                startActivity(new Intent(this, FragmentKgAct.class));
                break;
                case R.id.service:
                   startActivity(new Intent(this,ActivityService.class));
                    break;
            case R.id.broadcast:
                startActivity(new Intent(this,BraodcastAct.class));
                    break;
            default:
                break;
        }

    }
}
