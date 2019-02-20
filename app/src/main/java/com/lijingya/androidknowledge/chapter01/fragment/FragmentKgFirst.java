package com.lijingya.androidknowledge.chapter01.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.lijingya.androidknowledge.R;
import com.lijingya.androidknowledge.base.BaseFragment;

/**
 * @author lijingya
 * @description 添加描述
 * @email lijingya@91118.com
 * @createDate 2019/1/30
 * @company 杭州天音
 */
public class FragmentKgFirst extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.act_frag_kg_first, container, false);
        Button btn = view.findViewById(R.id.btn);
        Bundle bundle = getArguments();
        String key = bundle.getString("key");
        btn.setText(key);
        return view;
    }
}
