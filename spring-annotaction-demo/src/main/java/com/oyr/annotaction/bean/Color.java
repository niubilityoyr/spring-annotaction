package com.oyr.annotaction.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName Color
 * @Description
 * @Author ouyang
 * @Date
 */
public class Color implements InitializingBean, DisposableBean {

    public Color() {
        System.out.println("construction");
    }

    public void destroy() throws Exception {
        System.out.println(" disposableBean destroy ");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(" InitializingBean afterPropertiesSet ");
    }

}