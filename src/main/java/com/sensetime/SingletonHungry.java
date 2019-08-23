package com.sensetime;

/**
 * 单例模式：饿汉式
 * 类加载时进行对象创建
 * 线程不安全
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {};

    public static SingletonHungry getInstance() {
        return instance;
    }
}
