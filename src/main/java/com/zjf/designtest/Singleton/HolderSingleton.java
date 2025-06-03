package com.zjf.designtest.Singleton;

public class HolderSingleton {

    private HolderSingleton() {
        System.out.println("HolderSingleton is created");
    }

    private static class SingletonHolder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
