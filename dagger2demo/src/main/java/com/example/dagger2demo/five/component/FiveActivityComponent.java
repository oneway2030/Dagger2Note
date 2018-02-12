package com.example.dagger2demo.five.component;

import com.example.dagger2demo.five.FiveActivity;
import com.example.dagger2demo.five.module.FiveModule;

import dagger.Component;

/**
 * Created by Administrator on 2018/02/12.
 */

@Component(modules = {FiveModule.class})
public interface FiveActivityComponent {
    void inject(FiveActivity ac);
}
