package com.oyr.annotaction;

import com.oyr.annotaction.bean.Cat;
import com.oyr.annotaction.config.Config1;
import com.oyr.annotaction.config.Config4;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName DI_Test
 * @Description
 * @Author ouyang
 * @Date
 */
public class DI_Test {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(Config4.class);

    @Test
    public void test() {
        print(applicationContext);
        System.out.println("test applicationContext" + applicationContext);
        /*Cat bean = applicationContext.getBean(Cat.class);
        System.out.println(bean);*/
    }

    public void print(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}