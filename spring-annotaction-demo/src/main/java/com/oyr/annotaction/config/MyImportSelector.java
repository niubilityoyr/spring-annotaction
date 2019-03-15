package com.oyr.annotaction.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MyImportSelector
 * @Description
 * @Author ouyang
 * @Date
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.oyr.annotaction.bean.Yellow", "com.oyr.annotaction.bean.Red"};
    }

}