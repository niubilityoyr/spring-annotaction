package com.oyr.annotaction.bean;

/**
 * @ClassName Dog
 * @Description
 * @Author ouyang
 * @Date
 */
public class Dog {

    private Integer code;

    public Dog() {

    }

    public Dog(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "code=" + code +
                '}';
    }
}