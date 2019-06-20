package com.ant.toolkit.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *  服务Api需要添加的注解，主要用于封装统一处理
 * @author vam
 * @date 2019-05-24 00:29
 * @version 1.0
 * @see ApiAspect
 */
@Target(ElementType.METHOD)
public @interface ApiAnnotation {


}
