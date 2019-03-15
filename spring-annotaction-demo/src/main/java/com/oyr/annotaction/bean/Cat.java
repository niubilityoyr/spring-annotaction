package com.oyr.annotaction.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * @ClassName Cat
 * @Description
 * @Author ouyang
 * @Date
 */
@Component
public class Cat {

    // @Qualifier("dog1")
    // @Autowired
    // @Resource
    // @Inject
    private Dog dog;

/*    public Cat(Dog dog) {
        this.dog = dog;
    }*/

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "dog=" + dog +
                '}';
    }
}