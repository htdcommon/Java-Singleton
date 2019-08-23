package com.sensetime;

/**
 * 单例模式：懒汉式
 * 调用时进行对象创建
 * 线程不安全
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {};

    public static SingletonLazy getInstance() {
        if (instance == null)
            instance = new SingletonLazy();

        return instance;
    }
}
