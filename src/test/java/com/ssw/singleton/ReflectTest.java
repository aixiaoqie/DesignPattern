package com.ssw.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破解单例
 * <p>
 * 懒加载实现单例时，若单例对象尚未创建，可以通过反射创建对象，那么反射创建的对象与单例对象不同
 */
public class ReflectTest {

    public static void main(String[] args) {

        try {
            Class<?> clazz = LazySingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            Object o1 = LazySingleton.getInstance();
            Object o2 = constructor.newInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
