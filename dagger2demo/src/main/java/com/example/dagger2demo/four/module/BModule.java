package com.example.dagger2demo.four.module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/12.
 */
@Module
public class BModule {
    @Provides
    public String getUserName() {
        return "来,给你一个用户名test5";
    }
}
