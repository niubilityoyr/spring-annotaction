package com.oyr.annotaction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 根容器配置，不扫描controller
 * Created by Administrator on 2019/3/14.
 */
@ComponentScan(value = "com.oyr",
    excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})}
)
public class RootConfig {
}
