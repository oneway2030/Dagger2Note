package com.example.dagger2demo.four.module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/12.
 */
@Module
public class CommonModule {
    @Provides
    public String getUserName() {
        return "来,给你一个用户名";
    }
    @Provides
    public int getUserAge() {
        return 999;
    }
}
