package com.learningspring.mvcHandlerInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/*
Application Configuration class file to register the Interceptor into Interceptor Registry
*/
@Component
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Autowired
    MyCustomHandlerInterceptor myCustomHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myCustomHandlerInterceptor);
    }
}
