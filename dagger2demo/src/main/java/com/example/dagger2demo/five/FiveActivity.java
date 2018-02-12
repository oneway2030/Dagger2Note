package com.example.dagger2demo.five;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dagger2demo.R;
import com.example.dagger2demo.five.component.DaggerFiveActivityComponent;
import com.example.dagger2demo.five.module.FiveModule;
import com.oneway.log.LogUtil;

import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by oneway on 2018/02/12.
 * set与map
 */
public class FiveActivity extends AppCompatActivity {
    @Inject
    Map<String, String> map;
    @Inject
    Set<String> set;
    /**
     * set与map
     */
    private void simpleUse() {
        DaggerFiveActivityComponent.builder()
                .fiveModule(new FiveModule())
                .build()
                .inject(this);
        LogUtil.i("map==>" + map.toString());
        LogUtil.i("set==>" + set.toString());
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
