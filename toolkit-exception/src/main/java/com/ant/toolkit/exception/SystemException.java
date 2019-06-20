package com.ant.toolkit.exception;

import java.text.MessageFormat;

/**
 * @author vam
 * @version 1.0
 *
 * @date 2019-05-24 00:13
 *
 */
public class SystemException extends BaseException {

  public SystemException(int code, String message) {
    super(code, message);
  }

  public SystemException(String message) {
    super(message);
  }


  public SystemException(IError error) {
    super(error);
  }

  public SystemException(IError error, Object... objects) {
    super(error.getCode(), MessageFormat.format(error.getMessage(), objects));
  }
}
