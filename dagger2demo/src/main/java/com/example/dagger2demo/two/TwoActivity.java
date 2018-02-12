package com.example.dagger2demo.two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2demo.R;
import com.example.dagger2demo.two.bean.Children;
import com.example.dagger2demo.two.component.DaggerTwoActivityComponent;
import com.example.dagger2demo.two.module.TwoModule;
import com.oneway.log.LogUtil;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by oneway on 2018/02/12.
 * 最简单示例
 */
public class TwoActivity extends AppCompatActivity {
    @Named("boy")
    @Inject
    Children boy;
    @Named("gril")
    @Inject
    Children gril;

    /**
     * Qualifier与Named 的使用
     */
    private void simpleUse() {
        DaggerTwoActivityComponent.builder()
                .twoModule(new TwoModule())
                .build()
                .inject(this);
        LogUtil.i("boy==>" + boy.tag);
        LogUtil.i("gril==>" + gril.tag);
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
