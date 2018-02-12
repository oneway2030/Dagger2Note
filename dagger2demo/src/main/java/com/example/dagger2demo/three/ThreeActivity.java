package com.example.dagger2demo.three;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2demo.R;
import com.example.dagger2demo.three.bean.Test3;
import com.example.dagger2demo.three.component.DaggerThreeActivityComponent;
import com.example.dagger2demo.three.module.ThreeModule;
import com.oneway.log.LogUtil;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by oneway on 2018/02/12.
 * 作用域 Scope:Singleton
 */
public class ThreeActivity extends AppCompatActivity {

    @Inject
    Test3 one;
    @Inject
    Test3 two;
    /**
     * Scope 的使用
     */
    private void simpleUse() {
        DaggerThreeActivityComponent.builder()
                .threeModule(new ThreeModule())
                .build()
                .inject(this);
        LogUtil.i("one地址==>" + one.toString());
        LogUtil.i("two地址==>" + two.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn1)
    public void onViewClicked() {
        simpleUse();
    }
}
