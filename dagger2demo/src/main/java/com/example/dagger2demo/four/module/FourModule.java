package com.example.dagger2demo.four.module;

import com.example.dagger2demo.four.bean.Test4;
import com.example.dagger2demo.four.bean.Test5;

import dagger.Module;
import dagger.Provides;

/**
 * Created by oneway on 2018/02/12.
 */

@Module
public class FourModule {
    @Provides
    public Test4 provideTest4Instance(String name, int age) {
        return new Test4(name, age);
    }
    @Provides
    public Test5 provideTest5Instance(String name, int age) {
        return new Test5(name, age);
    }


}
