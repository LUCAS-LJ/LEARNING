/**
 * lucas 2019-09-11 23:11 spring深入学习
 */
package com.lucas.dependence;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-11 23:11
 */
public class Tom {
    private ICourse iCourse;
    /**
     *  构造注入方式每次都要new 一次，所以最好使用set注入
     private Course iCourse;

     public Tom(Course iCourse){
     this.iCourse = iCourse;
     }
     */

    public void setIcourse(ICourse icourse){
        this.iCourse = icourse;
    }

//    public void study(ICourse iCourse){
//        iCourse.study();
//    }

    public void study(){
        iCourse.study();
    }
}
