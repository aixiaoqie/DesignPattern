package com.ssw.singleton;

/**
 * 懒汉式单例
 * <p>
 * 线程安全；懒加载
 */
public class LazySingleton {
    private LazySingleton() {
        if (instance != null) {
            throw new RuntimeException("单例对象，请勿反射破解;");
        }
    }

    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
