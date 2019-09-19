/**
 * lucas 2019-09-18 08:24 spring深入学习
 */
package com.lucas.lazySingleton;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-18 08:24
 */
public class LazySimpleSingleton {


    //如下实现会有性能问题
//    private static LazySimpleSingleton lazySimpleSingleton = null;
//
//    public static synchronized LazySimpleSingleton getInstance(){
//        if(lazySimpleSingleton == null){
//            lazySimpleSingleton = new  LazySimpleSingleton();
//        }
//        return lazySimpleSingleton;
//    }



    //以下实现方式可以避免线程安全以及性能问题
//    private LazySimpleSingleton(){};
    private LazySimpleSingleton(){
        if(LazyHolder.lazy!=null){
            throw new RuntimeException("避免破坏单例模式");
        }
    }
    public static final LazySimpleSingleton getInstance(){
        return LazyHolder.lazy;
    }

    private static class LazyHolder{
        private static final LazySimpleSingleton lazy = new LazySimpleSingleton();
    }
}
