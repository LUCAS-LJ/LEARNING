/**
 * lucas 2019-09-11 23:37 spring深入学习
 */
package com.lucas.SimpleResponsibility;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-11 23:37
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
