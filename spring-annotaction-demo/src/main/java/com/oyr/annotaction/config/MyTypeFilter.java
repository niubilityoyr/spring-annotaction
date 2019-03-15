package com.oyr.annotaction.config;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @ClassName MyTypeFilter
 * @Description
 * @Author ouyang
 * @Date
 */
public class MyTypeFilter implements TypeFilter {

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        System.out.println("class：" + classMetadata.getClass());

        String className = classMetadata.getClassName();
        if(className.contains("er")) {
            return true;
        }
        return false;
    }

}