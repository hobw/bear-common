package com.bear.common.exception;

import java.text.MessageFormat;

/**
 * @author vam
 * @version 1.0
 * @desc
 * @date 2019-05-24 00:13
 * @see
 */
public class SystemException extends BaseException {

  SystemException(int code, String message) {
    super(code, message);
  }

  SystemException(IError error) {
    super(error);
  }

  SystemException(IError error, Object... objects) {
    super(error.getCode(), MessageFormat.format(error.getMessage(), objects));
  }
}
