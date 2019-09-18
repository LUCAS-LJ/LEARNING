/**
 * lucas 2019-09-11 23:12 spring深入学习
 */
package com.lucas.dependence;

/**
 *@program: LEARNING
 *@description: 依赖注入
 *@author: lucas
 *@create: 2019-09-11 23:12
 */
public class ExcuteClass {
    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());

        Tom tom = new Tom();
        tom.setIcourse(new JavaCourse());
        tom.study();

        tom.setIcourse(new PythonCourse());
        tom.study();
    }
}
