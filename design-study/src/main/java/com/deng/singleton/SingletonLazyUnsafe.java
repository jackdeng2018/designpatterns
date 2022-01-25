package com.deng.singleton;

/**
 * 懒汉式--线程不安全
 *
 * @author han.deng
 */
public class SingletonLazyUnsafe {
    private static SingletonLazyUnsafe instance;

    private SingletonLazyUnsafe() {
    }

    /**
     * 线程不安全时会导致实例化多次instance
     *
     * @return SingletonLazyUnsafe
     */
    public static SingletonLazyUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyUnsafe();
        }
        return instance;
    }
}
