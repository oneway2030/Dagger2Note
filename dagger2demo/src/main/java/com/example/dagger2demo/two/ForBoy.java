package com.example.dagger2demo.two;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2018/2/12.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForBoy {
}
