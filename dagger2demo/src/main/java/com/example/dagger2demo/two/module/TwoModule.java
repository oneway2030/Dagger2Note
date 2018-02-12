package com.example.dagger2demo.two.module;

import com.example.dagger2demo.two.ForBoy;
import com.example.dagger2demo.two.ForGril;
import com.example.dagger2demo.two.bean.Children;

import dagger.Module;
import dagger.Provides;

/**
 * Created by oneway on 2018/02/12.
 */

@Module
public class TwoModule {
    @Provides
//    @Named("boy")
    @ForBoy
    public Children provideBoy() {
        return new Children("男孩");
    }

    @Provides
//    @Named("gril")
    @ForGril
    public Children provideGril() {
        return new Children("女孩");
    }

}
