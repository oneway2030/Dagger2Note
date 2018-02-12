package com.example.dagger2demo.four.component;

import com.example.dagger2demo.four.module.AModule;
import com.example.dagger2demo.four.module.BModule;

import dagger.Component;

/**
 * Created by Administrator on 2018/2/12.
 */
@Component(modules = AModule.class)
public interface AComponent {
    BComponent plus(BModule module);
}
