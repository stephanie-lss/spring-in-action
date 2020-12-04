package com.cqupt.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LiSheng
 * @date 2020/12/4 15:06
 */
@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
public class SoundSystemConfig {
}
