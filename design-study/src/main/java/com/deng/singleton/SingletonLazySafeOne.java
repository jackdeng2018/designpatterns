package com.deng.singleton;

/**
 * 懒汉式--线程安全
 *
 * @author han.deng
 */
public class SingletonLazySafeOne {
    private static SingletonLazySafeOne instance;

    private SingletonLazySafeOne() {
    }

    /**
     * 当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 uniqueInstance 已经被实例化了。
     * 这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用
     *
     * @return SingletonLazySafeOne
     */
    public synchronized static SingletonLazySafeOne getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafeOne();
        }
        return instance;
    }
}
