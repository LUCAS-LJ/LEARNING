/**
 * lucas 2019-09-18 08:25 spring深入学习
 */
package com.lucas.lazySingleton;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-18 08:25
 */
public class ExetorThread implements Runnable{
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);
    }
}
