/**
 * lucas 2019-09-11 22:59 spring深入学习
 */
package com.lucas.ocp;

/**
 *@program: LEARNING
 *@description: 优惠逻辑类-不改变getprice
 *@author: lucas
 *@create: 2019-09-11 22:59
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id,String name,Double price){
        super(id,name,price);
    }

    public Double getOriginalPrice(){
        return super.getPrice();
    }

    /**
     * 功能描述: <br>
     * 〈次方法违反了里式替换原则〉
     * @Param:
     * @Return:
     * @Author: lucas
     * @Date: 2019/9/11 23:59
     */
    @Override
    public Double getPrice(){
        return super.getPrice()*0.61;
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.61;
    }
}
