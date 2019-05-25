package com.bear.common.exception.util;

import com.bear.common.exception.BizException;
import com.bear.common.exception.IError;
import com.bear.common.exception.SystemException;

/**
 * @author vam
 * @version 1.0
 *  断言工具
 * @date 2019-05-25 01:22
 *
 */
public class AssertUtil {


  //断言-业务异常

  public static void checkWithBizExecption(boolean positive, IError error) {
    if (!positive) {
      throw new BizException(error);
    }
  }

  public static void checkWithBizExecption(boolean positive, IError error, Object... args) {
    if (!positive) {
      throw new BizException(error, args);
    }

  }





  //断言-系统异常

  public static void checkWithSystemExecption(boolean positive, String message) {
    if (!positive) {
      throw new SystemException(message);
    }
  }

  public static void checkWithSystemExecption(boolean positive, IError error) {
    if (!positive) {
      throw new SystemException(error);
    }
  }

  public static void checkWithSystemExecption(boolean positive, IError error, Object... args) {
    if (!positive) {
      throw new SystemException(error, args);
    }
  }



}
