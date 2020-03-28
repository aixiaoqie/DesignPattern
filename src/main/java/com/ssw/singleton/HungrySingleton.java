package com.ssw.singleton;

/**
 * 饿汉式单例
 * <p>
 * 线程安全
 */
public class HungrySingleton {

    private HungrySingleton() {
        if(instance != null){
            throw new RuntimeException("单例对象，请勿反射破解");
        }
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
