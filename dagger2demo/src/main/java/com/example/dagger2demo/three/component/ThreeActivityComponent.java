package com.example.dagger2demo.three.component;

import com.example.dagger2demo.three.ThreeActivity;
import com.example.dagger2demo.three.module.ThreeModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/02/12.
 */
@Singleton
@Component(modules = ThreeModule.class)
public interface ThreeActivityComponent {
    void inject(ThreeActivity ac);
}
