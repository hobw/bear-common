package com.bear.common.interchange.response;

import lombok.Data;

/**
 * @author vam
 * @version 1.0
 * @desc 单个数据
 * @date 2019-05-24 00:45
 * @see
 */
@Data
public class PlainResult<T> extends BaseResult{

  /**
   * 数据
   */
  private T data;

}
