package com.bear.common.exception;

import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author vam
 * @version 1.0
 *  服务依赖异常
 * @date 2019-05-24 23:32
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DependencyException extends BaseException {

  /**
   * rpc调用的类名
   */
  private String RPC_CLASS;

  /**
   * rpc调用的方法名
   */
  private String RPC_METHOD;

  /**
   * rpc调用的入参
   */
  private Map<String, Object> RPC_PARAMS;

  /**
   * rpc调用返回的结果
   */
  private String RPC_RESULT;

  DependencyException(IError error, String rpcClass, String rpcMethod, Map<String, Object> rpcParams, String rpcResult) {
    super(error);
    this.RPC_CLASS = rpcClass;
    this.RPC_METHOD = rpcMethod;
    this.RPC_PARAMS = rpcParams;
    this.RPC_RESULT = rpcResult;
  }


  DependencyException(int code, String message, String rpcClass, String rpcMethod, Map<String, Object> rpcParams, String rpcResult) {
    super(code, message);
    this.RPC_CLASS = rpcClass;
    this.RPC_METHOD = rpcMethod;
    this.RPC_PARAMS = rpcParams;
    this.RPC_RESULT = rpcResult;
  }

}
