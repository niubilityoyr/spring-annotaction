package com.oyr.annotaction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * web ioc 容器，只扫描controller
 * Created by Administrator on 2019/3/14.
 */
@EnableWebMvc
@ComponentScan(value = "com.oyr.annotaction",
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})},
        useDefaultFilters = false
)
public class AppConfig {
}
