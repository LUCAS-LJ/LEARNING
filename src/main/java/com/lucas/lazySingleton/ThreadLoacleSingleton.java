/**
 * lucas 2019-09-19 08:31 spring深入学习
 */
package com.lucas.lazySingleton;

/**
 * 线程单例
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-19 08:31
 */
public class ThreadLoacleSingleton {
    private static final ThreadLocal<ThreadLoacleSingleton> instance = new ThreadLocal<ThreadLoacleSingleton>(){
        @Override
        protected ThreadLoacleSingleton initialValue(){
            return new ThreadLoacleSingleton();
        }
    };

    private ThreadLoacleSingleton(){};

    public static ThreadLoacleSingleton getInstance(){
        return instance.get();
    }

    public static void main(String[] args) {
        System.out.println(ThreadLoacleSingleton.getInstance());
        System.out.println(ThreadLoacleSingleton.getInstance());
        System.out.println(ThreadLoacleSingleton.getInstance());
        System.out.println(ThreadLoacleSingleton.getInstance());
        System.out.println(ThreadLoacleSingleton.getInstance());

//        Thread t1 = new Thread(new ExetorThread());
    }
}
