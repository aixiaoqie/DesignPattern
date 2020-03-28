package com.ssw.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        HungrySingleton s1 = HungrySingleton.getInstance();
        HungrySingleton s2 = HungrySingleton.getInstance();
        System.out.println(s1 == s2 );
    }
}
