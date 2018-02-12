package com.example.dagger2demo.one.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by oneway on 2018/02/12.
 */

@Module
public class OneModule {
    private Context mContext;

    public OneModule(Context context) {
        this.mContext = context;
    }

    //提供需要的对象 如果你需要的注入的一些第三方类
//    @Provides
//    public Test2 provideTest() {
//        return new Test2(mContext);
//    }

    //提供需要 Context
    @Provides
    public Context provideContent() {
        return mContext;
    }
}
