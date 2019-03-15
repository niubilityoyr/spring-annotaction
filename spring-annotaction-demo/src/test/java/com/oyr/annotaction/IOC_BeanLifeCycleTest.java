package com.oyr.annotaction;

import com.oyr.annotaction.config.Config2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName IOC_BeanLifeCycleTest
 * @Description
 * @Author ouyang
 * @Date
 */
public class IOC_BeanLifeCycleTest {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(Config2.class);

    @Test
    public void test() {
        print(applicationContext);
        Object person1 = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        applicationContext.close();
    }

    public void print(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}