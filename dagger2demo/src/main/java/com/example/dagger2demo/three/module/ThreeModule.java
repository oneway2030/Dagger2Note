package com.example.dagger2demo.three.module;

import com.example.dagger2demo.three.bean.Test3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by oneway on 2018/02/12.
 */

@Module
public class ThreeModule {
    @Singleton
    @Provides
    public Test3 provideTest3Instance() {
        return new Test3();
    }
}
