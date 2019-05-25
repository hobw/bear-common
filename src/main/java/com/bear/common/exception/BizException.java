package com.bear.common.exception;

import java.text.MessageFormat;

/**
 * @author vam
 * @version 1.0
 *  业务异常，一般为info warn级别的日志
 * @date 2019-05-24 00:04
 *
 */
public class BizException extends BaseException {

  public BizException(int code, String message) {
    super(code, message);
  }

  public BizException(IError error) {
    super(error);
  }

  public BizException(IError error, Object... objects) {
    super(error.getCode(), MessageFormat.format(error.getMessage(), objects));
  }
}
