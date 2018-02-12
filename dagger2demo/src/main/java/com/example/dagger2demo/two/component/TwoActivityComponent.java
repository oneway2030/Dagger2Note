package com.example.dagger2demo.two.component;

import com.example.dagger2demo.two.TwoActivity;
import com.example.dagger2demo.two.module.TwoModule;

import dagger.Component;

/**
 * Created by Administrator on 2018/02/12.
 */

@Component(modules = TwoModule.class)
public interface TwoActivityComponent {
    void inject(TwoActivity ac);
}
