package com.cqupt.concert;

import org.springframework.stereotype.Component;

/**
 * @author LiSheng
 * @date 2020/12/6 17:32
 */
@Component
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("encore");
    }
}
