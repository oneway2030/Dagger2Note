package com.example.dagger2demo.four.module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/2/12.
 */
@Module
public class AModule {
    @Provides
    public int getUserAge() {
        return 888;
    }
}
