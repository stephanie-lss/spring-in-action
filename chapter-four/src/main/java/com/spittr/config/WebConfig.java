package com.spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author LiSheng
 * @date 2020/12/8 18:20
 */
@Configuration
@ComponentScan(basePackages = "com.spittr.controller")
@Import(value = {AppConfig.class})
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    @Bean
    public ViewResolver mvcViewResolver(ContentNegotiationManager contentNegotiationManager) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }


    @Bean
    public HandlerAdapter handlerAdapter() {
        return new SimpleControllerHandlerAdapter();
    }

    @Bean
    public HandlerMapping handlerMapping() {
        return new BeanNameUrlHandlerMapping();
    }

}
