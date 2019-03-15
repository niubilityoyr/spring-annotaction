package com.oyr.annotaction.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/3/14.
 */
@Service
public class HelloService {

    public void println(String name) {
        System.out.println("hello " + name);
    }

}
