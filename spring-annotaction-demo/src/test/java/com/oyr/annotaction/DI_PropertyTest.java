package com.oyr.annotaction;

import com.oyr.annotaction.bean.Red;
import com.oyr.annotaction.config.Config3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName DI_PropertyTest
 * @Description
 * @Author ouyang
 * @Date
 */
public class DI_PropertyTest {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(Config3.class);

    @Test
    public void test() {
        print(applicationContext);
        Red bean = applicationContext.getBean(Red.class);
        System.out.println(bean);
        String user = applicationContext.getEnvironment().getProperty("name");
        System.out.println(user);
    }

    public void print(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}