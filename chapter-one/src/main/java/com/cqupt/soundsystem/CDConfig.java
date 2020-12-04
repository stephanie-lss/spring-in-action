package com.cqupt.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiSheng
 * @date 2020/12/4 14:28
 */
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
}
