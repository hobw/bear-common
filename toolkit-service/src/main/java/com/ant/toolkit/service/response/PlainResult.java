package com.ant.toolkit.service.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author vam
 * @version 1.0
 *  单个数据
 * @date 2019-05-24 00:45
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PlainResult<T> extends BaseResult{

  /**
   * 数据
   */
  private T data;

}
