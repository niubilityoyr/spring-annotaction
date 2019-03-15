package com.oyr.annotaction.config;

import com.oyr.annotaction.bean.Dog;
import com.oyr.annotaction.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @ClassName Cofig1
 * @Description
 * @Author ouyang
 * @Date
 */
/*@ComponentScans({
        @ComponentScan(value = "com.oyr", includeFilters = {
                // @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class, Service.class})
                // @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = MyTypeFilter.class)
        }, useDefaultFilters = false)
})*/
@Import(value = {
        Dog.class,
        MyImportSelector.class,
        MyImportBeanDefinitionRegistrar.class
})
@ComponentScan(value = "com.oyr")
@Configuration
public class Config1 {

    // @Scope("prototype")
    @Lazy
    @Bean("person1")
    public Person person() {
        return new Person();
    }


    @Conditional(WindowsCondition.class)
    @Bean
    public Person windows() {
        return new Person();
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public Person linux() {
        return new Person();
    }

    /*@Bean
    public Dog dog() {
        return new Dog();
    }*/

}