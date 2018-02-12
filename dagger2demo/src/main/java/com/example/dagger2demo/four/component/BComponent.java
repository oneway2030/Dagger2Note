package com.example.dagger2demo.four.component;

import com.example.dagger2demo.four.module.BModule;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/2/12.
 */
@Subcomponent(modules = BModule.class)
public interface BComponent {
    FourActivityComponent plus();
}
