/**
 * lucas 2019-09-11 23:30 spring深入学习
 */
package com.lucas.SimpleResponsibility;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-11 23:30
 */
public class Course {
    public void study(String courseName){
        if("A".equals(courseName)){
            System.out.println(String.format("%s不能倒退",courseName));
        }else{
            System.out.println(String.format("%s能倒退",courseName));
        }
    }
}
