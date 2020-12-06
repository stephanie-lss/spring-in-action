package com.cqupt.concert;

import org.springframework.stereotype.Component;

/**
 * @author LiSheng
 * @date 2020/12/6 15:31
 */
@Component
public class MusicPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("Music is so great!!");
    }
}
