package com.example.dagger2demo.four.component;

import com.example.dagger2demo.four.FourActivity;
import com.example.dagger2demo.four.module.FourModule;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/02/12.
 */

//@Component(modules = {FourModule.class}, dependencies = CommonComponent.class)
@Subcomponent(modules = FourModule.class)
public interface FourActivityComponent {
    void inject(FourActivity ac);
}
