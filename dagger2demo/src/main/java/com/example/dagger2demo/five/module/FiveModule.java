package com.example.dagger2demo.five.module;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

/**
 * Created by oneway on 2018/02/12.
 */

@Module
public class FiveModule {
    @Provides(type = Provides.Type.MAP)
    @StringKey("key1")
//    @IntKey(1)
    public String provideMap() {
        return "value1";
    }
    @Provides
    @IntoMap
    @StringKey("key2")
    public String provideseMap2() {
        return "value1";
    }

    @Provides(type = Provides.Type.SET_VALUES)
//    @ElementsIntoSet
    public Set<String> provideset() {
        return new HashSet<>(Arrays.asList("aaa", "bbb"));
    }

//    @Provides(type = Provides.Type.SET)
//    @IntoSet
//    public String provideset2() {
//        return "aaa";
//    }


}
