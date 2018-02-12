package com.example.dagger2demo.one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dagger2demo.R;
import com.example.dagger2demo.one.bean.Test2;
import com.example.dagger2demo.one.component.DaggerOneActivityComponent;
import com.example.dagger2demo.one.module.OneModule;
import com.oneway.log.LogUtil;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by oneway on 2018/02/12.
 * 最简单示例
 */
public class OneActivity extends AppCompatActivity {
    @Inject
    Test2 test2;
    /**
     * module与Provides的使用
     */
    private void simpleUse() {
        DaggerOneActivityComponent.builder()
                .oneModule(new OneModule(getApplicationContext()))
                .build()
                .inject(this);
        LogUtil.i("test2地址==>" + test2.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                simpleUse();
                break;
        }
    }


}
