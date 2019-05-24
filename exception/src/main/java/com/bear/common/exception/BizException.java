package com.bear.common.exception;

import java.text.MessageFormat;

/**
 * @author vam
 * @version 1.0
 * @desc 业务异常，一般为info warn级别的日志
 * @date 2019-05-24 00:04
 * @see
 */
public class BizException extends BaseException {

  BizException(int code, String message) {
    super(code, message);
  }

  BizException(IError error) {
    super(error);
  }

  BizException(IError error, Object... objects) {
    super(error.getCode(), MessageFormat.format(error.getMessage(), objects));
  }
}
