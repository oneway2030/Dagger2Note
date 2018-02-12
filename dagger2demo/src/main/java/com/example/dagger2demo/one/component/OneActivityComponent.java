package com.example.dagger2demo.one.component;

import com.example.dagger2demo.one.OneActivity;
import com.example.dagger2demo.one.module.OneModule;

import dagger.Component;

/**
 * Created by Administrator on 2018/02/12.
 */

@Component(modules = {OneModule.class})
public interface OneActivityComponent {
    void inject(OneActivity ac);
}
