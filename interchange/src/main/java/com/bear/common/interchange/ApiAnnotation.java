package com.bear.common.interchange;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @desc 服务Api需要添加的注解，主要用于封装统一处理
 * @Author vam
 * @Date 2019-05-24 00:29
 * @Version 1.0
 * @see ApiAspect
 */
@Target(ElementType.METHOD)
public @interface ApiAnnotation {


}
