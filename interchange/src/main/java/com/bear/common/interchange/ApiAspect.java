package com.bear.common.interchange;

import com.bear.common.exception.BizException;
import com.bear.common.exception.SystemException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import javax.validation.ConstraintViolationException;

/**
 * @author vam
 * @version 1.0
 * @desc ApiAnnotation的处理器
 * @date 2019-05-24 00:35
 * @see ApiAnnotation
 */
@Aspect
public class ApiAspect {


  @Around(value = "@annotation(ApiAnnotation)")
  public Object process(ProceedingJoinPoint joinPoint, ApiAnnotation apiAnnotation) {

    Object result = null;
    try {

      //接口执行时间

      //方法名 入参 返回值打印

      //设置日志traceId

      result = joinPoint.proceed();
    } catch (BizException bizException) {

    } catch (SystemException systemException) {

    } catch (ConstraintViolationException violationException) {

    } catch (Throwable throwable) {

    } finally {

    }
    return result;
  }
}
