package com.spittr.dao;

import com.spittr.pojo.Spittle;

import java.util.List;

/**
 * @author LiSheng
 * @date 2020/12/8 21:06
 */
public interface SpittleRepository {
    /**
     *
     * @param max:Spittle ID属性的最大值
     * @param count:需要返回多少个Spittle对象
     * @return
     */
    List<Spittle> findSpittles(long max, int count);
}
