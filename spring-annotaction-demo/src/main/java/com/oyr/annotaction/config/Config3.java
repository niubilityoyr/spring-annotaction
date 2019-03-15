package com.oyr.annotaction.config;

import com.oyr.annotaction.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName Config3
 * @Description
 * @Author ouyang
 * @Date
 */
@PropertySource(value = {
    "classpath:cs.properties"
})
@Configuration
public class Config3 {

    @Bean
    public Red red() {
        return new Red();
    }

}