package com.bear.common.exception;

/**
 * @desc 建议所有异常信息及异常code统一管理，并实现该接口
 * @Author vam
 * @Date 2019-05-23 23:46
 * @Version 1.0
 * @see
 */
public interface IError {


  String getMessage();

  int getCode();

}
