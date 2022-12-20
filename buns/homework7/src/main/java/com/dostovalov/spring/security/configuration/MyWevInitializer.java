package com.dostovalov.spring.security.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWevInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
//    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
