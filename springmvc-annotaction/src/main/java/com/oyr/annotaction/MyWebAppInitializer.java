package com.oyr.annotaction;

import com.oyr.annotaction.config.AppConfig;
import com.oyr.annotaction.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Administrator on 2019/3/14.
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 设置根容器的配置类（根容器）
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    // 设置子容器的配置类（web ioc 容器）
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    // 设置mvc拦截路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
