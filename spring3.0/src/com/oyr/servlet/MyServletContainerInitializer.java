package com.oyr.servlet;

import com.oyr.filter.UserFilter;
import com.oyr.listener.MyServletContextListener;
import com.oyr.service.HelloService;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Administrator on 2019/3/14.
 */
@HandlesTypes(value = {HelloService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    /**
     * 在应用启动时调用
     * @param set 感兴趣的类
     * @param servletContext 当前应用的上下文
     * @throws ServletException
     */
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("当前应用上下文：" + servletContext);
        for (Class<?> aClass : set) {
            System.out.println("感兴趣的类:" + aClass);
        }

        // 新增servlet
        ServletRegistration.Dynamic servletDynamic =
                servletContext.addServlet("userServlet", new UserServlet());
        servletDynamic.addMapping("/user");

        // 新增监听器
        servletContext.addListener(new MyServletContextListener());

        // 新增filter，并制定拦截路径
        FilterRegistration.Dynamic filterDynamic = servletContext.addFilter("userFilter", new UserFilter());
        filterDynamic.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");

    }
}
