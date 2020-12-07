package com.cqupt.spitter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author LiSheng
 * @date 2020/12/7 11:56
 */
@Configuration
@ComponentScan(basePackages = {"com.cqupt.spitter"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,
                        value = EnableWebMvc.class)
        })
public class RootConfig {
}
