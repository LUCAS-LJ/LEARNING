/**
 * lucas 2019-09-11 22:54 spring深入学习
 */
package com.lucas.ocp;

/**
 *@program: LEARNING
 *@description: JavaCourse
 *@author: lucas
 *@create: 2019-09-11 22:54
 */
public class JavaCourse implements ICourse{

    private Integer id;

    private String name;

    private Double price;

    public JavaCourse(Integer id,String name,Double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
