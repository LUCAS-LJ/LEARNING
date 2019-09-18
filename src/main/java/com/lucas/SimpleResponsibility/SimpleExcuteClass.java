/**
 * lucas 2019-09-11 23:32 spring深入学习
 */
package com.lucas.SimpleResponsibility;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-11 23:32
 */
public class SimpleExcuteClass {
    public static void main(String[] args) {
//        Course course = new Course();
//        course.study("B");
//        course.study("A");

        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("A");

        RelayCourse relayCourse = new RelayCourse();
        relayCourse.study("B");
    }
}
