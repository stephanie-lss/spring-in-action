package com.cqupt.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiSheng
 * @date 2020/12/6 15:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class PerformanceTest {

    @Autowired
    Performance performance;

    @Test
    public void perform() {
        performance.perform();
    }
}
