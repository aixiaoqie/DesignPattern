package com.ssw.singleton;

/**
 * 枚举 实现单例
 * <p>
 * 线程安全
 */
public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
