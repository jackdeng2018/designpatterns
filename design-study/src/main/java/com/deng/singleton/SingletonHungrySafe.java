package com.deng.singleton;

/**
 * 饿汉式线程安全
 *
 * @author han.deng
 */
public class SingletonHungrySafe {
    private static SingletonHungrySafe instance = new SingletonHungrySafe();

    private SingletonHungrySafe() {
    }

    /**
     * 直接实例化的方式也丢失了延迟实例化带来的节约资源的好处
     *
     * @return SingletonHungrySafe
     */
    public static SingletonHungrySafe getInstance() {
        return instance;
    }
}
