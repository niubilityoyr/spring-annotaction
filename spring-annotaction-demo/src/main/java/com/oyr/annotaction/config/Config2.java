package com.oyr.annotaction.config;

import com.oyr.annotaction.bean.Color;
import com.oyr.annotaction.bean.Person;
import com.oyr.annotaction.bean.Pig;
import com.oyr.annotaction.bean.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName Cofig2
 * @Description
 * @Author ouyang
 * @Date
 */
@Configuration
public class Config2 {

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Person person() {
        return new Person();
    }

    @Bean
    public Color color() {
        return new Color();
    }

    @Bean
    public Yellow yellow() {
        return new Yellow();
    }

    @Bean
    public Pig pig() {
        return new Pig();
    }
}