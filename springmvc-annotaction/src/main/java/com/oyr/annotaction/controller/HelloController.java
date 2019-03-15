package com.oyr.annotaction.controller;

import com.oyr.annotaction.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/3/14.
 */
@RequestMapping("/hello")
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    // @ResponseBody
    public String hello() {
        helloService.println("tomcat...");
        return "success";
    }

}
