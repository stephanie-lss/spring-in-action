package com.cqupt.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author LiSheng
 * @date 2020/12/6 17:31
 */
@Aspect
@Component
public class EncoreableIntroducer {

    /**
     *  value属性指定了哪种类型的bean要引入该接口,+号表示是Performance的所有子类型，而不是本身
     *  defaultImpl属性指定了为引入功能提供实现的类
     *   DeclareParents注解所标注的静态属性指明了要引入的接口
     */
    @DeclareParents(value = "com.cqupt.concert.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
