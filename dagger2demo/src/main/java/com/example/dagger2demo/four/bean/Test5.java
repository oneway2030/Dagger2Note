package com.example.dagger2demo.four.bean;

/**
 * Created by oneway on 2018/02/12.
 */

public class Test5 {
    public String name;
    public int age;
    public Test5(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Test4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
