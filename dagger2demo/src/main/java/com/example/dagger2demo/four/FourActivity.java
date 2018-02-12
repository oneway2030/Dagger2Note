package com.example.dagger2demo.four;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dagger2demo.R;
import com.example.dagger2demo.four.bean.Test5;
import com.example.dagger2demo.four.component.DaggerAComponent;
import com.example.dagger2demo.four.module.BModule;
import com.oneway.log.LogUtil;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by oneway on 2018/02/12.
 * 组件依赖 dependence与SubComponent
 */
public class FourActivity extends AppCompatActivity {
    //    @Inject
//    Test4 test4;
    @Inject
    Test5 test5;

    /**
     * dependence与SubComponent的使用
     */
    private void simpleUse() {
//        DaggerFourActivityComponent.builder()
//                .commonModule(new CommonModule())
//                .fourModule(new FourModule())
//                .build()
//                .inject(this);
//        LogUtil.i("test4==>" + test4.toString());
        //SubComponent
        DaggerAComponent.create()
                .plus(new BModule())
                .plus()
                .inject(this);
        LogUtil.i("test5==>" + test5.toString());
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
