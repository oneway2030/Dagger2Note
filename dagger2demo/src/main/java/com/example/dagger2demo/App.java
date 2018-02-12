package com.example.dagger2demo;

import android.app.Application;
import android.util.Log;

import com.oneway.log.LogUtil;
import com.oneway.log.inner.LogcatTree;

/**
 * Created by oneway on 2018/02/12.
 */

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        initLog();
    }

    private void initLog() {
        LogUtil.getLogConfig()
                .configAllowLog(true)//是否输出日志
                .configShowBorders(true)//是否排版显示
                .configTagPrefix("test")//设置标签前缀
                .configFormatTag("%d{HH:mm:ss:SSS} %t %c{-5}")//个性化设置标签，默认显示包名
                .configLevel(Log.VERBOSE);//设置日志最小输出级别，默认Log.VERBOSE
        LogUtil.plant(new LogcatTree());//添加打印日志信息到Logcat的树
    }

}
