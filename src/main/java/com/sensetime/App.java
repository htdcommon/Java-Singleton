package com.sensetime;

public class App {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();

        SingletonHungry singletonHungry = SingletonHungry.getInstance();
    }
}
