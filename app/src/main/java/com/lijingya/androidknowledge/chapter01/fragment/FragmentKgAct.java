package com.lijingya.androidknowledge.chapter01.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.lijingya.androidknowledge.R;
import com.lijingya.androidknowledge.base.BaseActivity;


/**
 * @author lijingya
 * @description 添加描述
 * @email lijingya@91118.com
 * @createDate 2019/1/30
 * @company 杭州天音
 */
public class FragmentKgAct extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_frag_kg);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = supportFragmentManager.beginTransaction();
        FragmentKgFirst fragmentKgFirst = new FragmentKgFirst();
        Bundle bundle = new Bundle();
        bundle.putString("key", "Hello");
        fragmentKgFirst.setArguments(bundle);
        ft.add(R.id.fl, fragmentKgFirst, "first");
        ft.commit();
    }
}
