package com.bear.common.exception;

/**
 * 建议所有异常信息及异常code统一管理，并实现该接口
 * @author vam
 * @date 2019-05-23 23:46
 * @version 1.0
 *
 */
public interface IError {


  String getMessage();

  int getCode();

}
