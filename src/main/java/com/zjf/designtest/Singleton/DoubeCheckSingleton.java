package com.zjf.designtest.Singleton;

/**
 * 双重检测单例
 */
public class DoubeCheckSingleton {
    private static volatile DoubeCheckSingleton instance;

    private DoubeCheckSingleton() {
        System.out.println("DoubeCheckSingleton is created");
    }

    public static DoubeCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubeCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubeCheckSingleton();
                }
            }
        }
        return instance;
    }
}
