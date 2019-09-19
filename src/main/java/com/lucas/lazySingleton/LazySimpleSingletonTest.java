/**
 * lucas 2019-09-18 08:27 spring深入学习
 */
package com.lucas.lazySingleton;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-18 08:27
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExetorThread());
        Thread thread2 = new Thread(new ExetorThread());
        thread1.start();
        thread2.start();
        System.out.println("end");
    }
}
