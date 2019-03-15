package com.oyr.annotaction.config;

import com.oyr.annotaction.bean.Color;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName ColorFactoryBean
 * @Description
 * @Author ouyang
 * @Date
 */
@Component
public class ColorFactoryBean implements FactoryBean {

    public Object getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return true;
    }
}