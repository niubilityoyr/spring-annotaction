package com.oyr.annotaction;

import com.oyr.annotaction.config.Config5;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2019/3/14.
 */
public class Profile_Test {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        // 设置环境
        applicationContext.getEnvironment().setActiveProfiles("dev", "test");
        // 注册配置类
        applicationContext.register(Config5.class);
        // 启动spring容器
        applicationContext.refresh();
        // 打印信息
        print(applicationContext);
    }

    public void print(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
