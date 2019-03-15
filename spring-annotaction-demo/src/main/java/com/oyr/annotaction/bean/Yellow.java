package com.oyr.annotaction.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName Yellow
 * @Description
 * @Author ouyang
 * @Date
 */
public class Yellow {

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("PreDestroy");
    }

}