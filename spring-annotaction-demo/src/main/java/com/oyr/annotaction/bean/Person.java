package com.oyr.annotaction.bean;

/**
 * @ClassName Person
 * @Description
 * @Author ouyang
 * @Date
 */
public class Person {

    public Person() {
        System.out.println("construction");
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

}