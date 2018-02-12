package com.example.dagger2demo.four.component;

import com.example.dagger2demo.four.module.CommonModule;

import dagger.Component;

/**
 * Created by Administrator on 2018/2/12.
 */
@Component(modules = CommonModule.class)
public interface CommonComponent {
    String getUserName();
    int getUserAge();
}
