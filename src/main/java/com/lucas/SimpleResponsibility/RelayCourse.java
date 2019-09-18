/**
 * lucas 2019-09-11 23:33 spring深入学习
 */
package com.lucas.SimpleResponsibility;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-11 23:33
 */
public class RelayCourse extends Course{

    @Override
    public void study(String courseName){
        System.out.println(String.format("%s能倒退",courseName));
    }
}
