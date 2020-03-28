package com.ssw.singleton;

/**
 * 静态内部类 实现单例
 * <p>
 * 线程安全；懒加载
 */
public class StaticInnnerClassSingleton {

    private StaticInnnerClassSingleton() {
    }

    private static class InnerClass {
        private static final StaticInnnerClassSingleton instance = new StaticInnnerClassSingleton();
    }

    public static StaticInnnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

}
