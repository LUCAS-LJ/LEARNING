/**
 * lucas 2019-09-17 08:22 spring深入学习
 */
package com.lucas.SimpleFactory;

/**
 * 简单工程模式
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-17 08:22
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        IcourseFacotry icourseFacotry = new IcourseFacotry();
        icourseFacotry.create(JavaCourse.class).record();
    }
}
