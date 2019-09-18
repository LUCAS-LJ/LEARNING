/**
 * lucas 2019-09-17 08:19 spring深入学习
 */
package com.lucas.SimpleFactory;

/**
 *@program: LEARNING
 *@description:
 *@author: lucas
 *@create: 2019-09-17 08:19
 */
public class IcourseFacotry {

    public Icourse create(Class<? extends  Icourse> clazz){
        if(clazz!=null){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
