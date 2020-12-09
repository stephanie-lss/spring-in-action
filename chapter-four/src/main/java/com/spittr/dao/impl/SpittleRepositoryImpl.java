package com.spittr.dao.impl;

import com.spittr.dao.SpittleRepository;
import com.spittr.pojo.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LiSheng
 * @date 2020/12/8 21:47
 */
@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> ret = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ret.add(new Spittle((long) i, "spittles" + i, new Date(10), 10.2, 10.3));
        }
        return ret;
    }
}
