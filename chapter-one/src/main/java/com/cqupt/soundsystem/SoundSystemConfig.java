package com.cqupt.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author LiSheng
 * @date 2020/12/4 15:06
 */
@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
public class SoundSystemConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
