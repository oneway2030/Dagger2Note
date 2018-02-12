package com.example.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dagger2demo.bean.Test;
import com.example.dagger2demo.five.FiveActivity;
import com.example.dagger2demo.four.FourActivity;
import com.example.dagger2demo.one.OneActivity;
import com.example.dagger2demo.three.ThreeActivity;
import com.example.dagger2demo.two.TwoActivity;
import com.oneway.log.LogUtil;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.Lazy;

public class MainActivity extends AppCompatActivity {
    @Inject
    Test test;
    @Inject
    Lazy<Test> test2;

    /**
     * 最简单使用
     */
    private void simpleUse() {
        Test test = test2.get();
        LogUtil.i("test地址==>" + test.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1: //最基础使用Inject---component应用
                simpleUse();
                break;
            case R.id.btn2: //Inject-module-component 简单使用示例
                startActivity(new Intent(this, OneActivity.class));
                break;
            case R.id.btn3: //Qualifier与Named
                startActivity(new Intent(this, TwoActivity.class));
                break;
            case R.id.btn4: //作用域 Scope:Singleton
                startActivity(new Intent(this, ThreeActivity.class));
                break;
            case R.id.btn5://组件依赖 dependence与SubComponent
                startActivity(new Intent(this, FourActivity.class));
                break;
            case R.id.btn6://set与map
                startActivity(new Intent(this, FiveActivity.class));
                break;
        }
    }


}
