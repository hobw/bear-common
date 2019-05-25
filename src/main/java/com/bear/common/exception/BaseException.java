package com.bear.common.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 基础异常类
 * @author vam
 * @version 1.0
 * @date 2019-05-23 23:36
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
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

  BaseException(String message) {
    super(message);
  }

}
