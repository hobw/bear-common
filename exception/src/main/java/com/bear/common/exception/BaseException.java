package com.bear.common.exception;


/**
 * @author vam
 * @version 1.0
 * @desc 基础异常类
 * @date 2019-05-23 23:36
 * @see
 */
public class BaseException extends RuntimeException {


  /**
   * 错误代码
   */
  private int code;


  BaseException(int code, String message) {
    super(message);
    this.code = code;
  }

  BaseException(IError error) {
    super(error.getMessage());
    this.code = error.getCode();
  }

}
