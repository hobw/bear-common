package com.bear.common.log;

import com.bear.common.exception.util.AssertUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.spi.LocationInfo;
import org.slf4j.Logger;
import org.slf4j.MDC;

import sun.reflect.annotation.TypeAnnotation;

import java.text.MessageFormat;
import java.util.UUID;

/**
 * @author vam
 * @version 1.0
 *  统一封装的日志工具类，主要功能有：
 *    1. 统一日志内容和格式；
 *    2. 生成日志唯一标识
 *
 * @date 2019-05-25 00:33
 *
 */
public class LogUtil {

  public final static String TRACE_ID = "log_trace_id";


  public static void main(String[] args) {
    MDC.put(TRACE_ID, createTraceId());
    System.out.println(getMessage("测试日志"));
  }


  /**
   * 由UUID生成唯一标识（去除'-'）
   * @return traceId
   */
  public static String createTraceId() {
    String uuidStr = UUID.randomUUID().toString();
    return uuidStr.replaceAll("-", "");
  }


  private static String getMessage(String format, Object... args) {

    StringBuilder strBuilder = new StringBuilder();
    LocationInfo locationInfo = new LocationInfo(new Throwable(), LogUtil.class.getName());
    strBuilder.append("[").append(MDC.get(TRACE_ID)).append("]").append(" 行数: ").append(locationInfo.fullInfo).append(" | ").append("日志: ");
    if (StringUtils.isNotBlank(format)) {
      strBuilder.append(MessageFormat.format(format, args));
    }
    return strBuilder.toString();
  }


  /**********************************debug**********************************/

  public static void debug(Logger logger, String message) {
    if (logger.isDebugEnabled()) {
      logger.debug(getMessage(message));
    }
  }

  public static void debug(Logger logger, String format, Object... args) {
    if (logger.isDebugEnabled()) {
      logger.debug(getMessage(format, args));
    }
  }


  public static void debug(Logger logger, String message, Throwable throwable) {
    if (logger.isDebugEnabled()) {
      logger.debug(getMessage(message), throwable);
    }
  }

  public static void debug(Logger logger, Throwable throwable, String format, Object... args) {
    if (logger.isDebugEnabled()) {
      logger.debug(getMessage(format, args), throwable);
    }
  }


  /**********************************info**********************************/

  public static void info(Logger logger, String message) {
    if (logger.isInfoEnabled()) {
      logger.info(getMessage(message));
    }
  }

  public static void info(Logger logger, String format, Object... args) {
    if (logger.isInfoEnabled()) {
      logger.info(getMessage(format, args));
    }
  }


  public static void info(Logger logger, String message, Throwable throwable) {
    if (logger.isInfoEnabled()) {
      logger.info(getMessage(message), throwable);
    }
  }

  public static void info(Logger logger, Throwable throwable, String format, Object... args) {
    if (logger.isInfoEnabled()) {
      logger.info(getMessage(format, args), throwable);
    }
  }

  /**********************************warn**********************************/

  public static void warn(Logger logger, String message) {
    if (logger.isWarnEnabled()) {
      logger.warn(getMessage(message));
    }
  }

  public static void warn(Logger logger, String format, Object... args) {
    if (logger.isWarnEnabled()) {
      logger.warn(getMessage(format, args));
    }
  }


  public static void warn(Logger logger, String message, Throwable throwable) {
    if (logger.isWarnEnabled()) {
      logger.warn(getMessage(message), throwable);
    }
  }

  public static void warn(Logger logger, Throwable throwable, String format, Object... args) {
    if (logger.isWarnEnabled()) {
      logger.warn(getMessage(format, args), throwable);
    }
  }

  /**********************************error**********************************/

  public static void error(Logger logger, String message) {
    if (logger.isErrorEnabled()) {
      logger.error(getMessage(message));
    }
  }

  public static void error(Logger logger, String format, Object... args) {
    if (logger.isErrorEnabled()) {
      logger.error(getMessage(format, args));
    }
  }


  public static void error(Logger logger, String message, Throwable throwable) {
    if (logger.isErrorEnabled()) {
      logger.error(getMessage(message), throwable);
    }
  }

  public static void error(Logger logger, Throwable throwable, String format, Object... args) {
    if (logger.isErrorEnabled()) {
      logger.error(getMessage(format, args), throwable);
    }
  }

}
