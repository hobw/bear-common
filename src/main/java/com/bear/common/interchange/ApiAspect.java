package com.bear.common.interchange;

import com.bear.common.exception.BizException;
import com.bear.common.exception.SystemException;
import com.bear.common.log.LogUtil;

import org.apache.log4j.MDC;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import javax.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;

/**
 * @author vam
 * @version 1.0
 *  ApiAnnotation的处理器
 * @date 2019-05-24 00:35
 * @see ApiAnnotation
 */
@Slf4j
@Aspect
public class ApiAspect {


  @Around(value = "@annotation(apiAnnotation)")
  public Object process(ProceedingJoinPoint joinPoint, ApiAnnotation apiAnnotation) {

    //方法调用的开始时间(毫秒)
    long startTime = System.currentTimeMillis();


    Object result = null;
    try {

      //方法名 入参 返回值打印

      //设置日志traceId
      MDC.put(LogUtil.TRACE_ID, LogUtil.createTraceId());

      //执行逻辑
      result = joinPoint.proceed();

    } catch (BizException bizException) {
      //业务异常，打印warn级别的日志
      //LogUtil.warn(log, );

    } catch (SystemException systemException) {
      //系统异常，打印error级别的日志


    } catch (ConstraintViolationException violationException) {
      //javax validation验证失败，打印warn级别的日志


    } catch (Throwable throwable) {
      //未知错误，打印error级别的日志


    } finally {
      long costTime = System.currentTimeMillis() - startTime;
      //LogUtil.info

    }
    MDC.remove(LogUtil.TRACE_ID);
    return result;
  }
}
