package com.oyr.annotaction.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName Red
 * @Description
 * @Author ouyang
 * @Date
 */
public class Red {

    @Value("${name}")
    private String name;

    @Value("${sex}")
    private String sex;

    @Value("#{10 + 23}")
    public Integer age;

    public Red() {
    }

    public Red(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}