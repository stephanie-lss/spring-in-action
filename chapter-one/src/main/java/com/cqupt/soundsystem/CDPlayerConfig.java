package com.cqupt.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiSheng
 * @date 2020/12/3 15:44
 */
@Configuration
//@ComponentScan
//@Import(CDConfig.class)
public class CDPlayerConfig {
    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
