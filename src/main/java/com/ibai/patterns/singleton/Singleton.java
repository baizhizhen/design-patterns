package com.ibai.patterns.singleton;

/**
 * 单例模式
 * 定义：确保一个类只有一个实例，提供全局访问类唯一对象的接口
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
