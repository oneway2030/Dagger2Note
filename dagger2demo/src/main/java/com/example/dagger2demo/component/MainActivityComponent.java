package com.example.dagger2demo.component;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

/**
 * Created by Administrator on 2018/02/12.
 */

@Component
public interface MainActivityComponent {
    void inject(MainActivity ac);
}
