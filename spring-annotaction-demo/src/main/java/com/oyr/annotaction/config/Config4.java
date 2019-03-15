package com.oyr.annotaction.config;

import com.oyr.annotaction.bean.Cat;
import com.oyr.annotaction.bean.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 * @ClassName Config4
 * @Description
 * @Author ouyang
 * @Date
 */
@PropertySource("classpath:cs.properties")
@ComponentScan({
        "com.oyr.annotaction.bean"
})
@Configuration
public class Config4 {

    @Bean
    public Dog dog1() {
        return new Dog(1);
    }

    // @Primary
    // @Bean
    public Dog dog2() {
        return new Dog(2);
    }

    @Bean
    public Cat cat(Dog dog) {
        Cat cat = new Cat();
        cat.setDog(dog);
        return cat;
    }

}