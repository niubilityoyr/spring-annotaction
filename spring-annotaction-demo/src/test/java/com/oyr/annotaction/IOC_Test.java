package com.oyr.annotaction;

import com.oyr.annotaction.config.Config1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName IOC_Test
 * @Description
 * @Author ouyang
 * @Date
 */
public class IOC_Test {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config1.class);

    @Test
    public void test() {
        print(applicationContext);
        // Person person1 = (Person) applicationContext.getBean("person1");
        // Person person2 = applicationContext.getBean(Person.class);
        // System.out.println(person1 == person2);
        Object object1 = applicationContext.getBean("colorFactoryBean");
        Object object2 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(object1);
        System.out.println(object2);
    }

    public void print(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}