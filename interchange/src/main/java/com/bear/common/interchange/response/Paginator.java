package com.bear.common.interchange.response;

import lombok.Data;

/**
 * @author vam
 * @version 1.0
 * @desc 分页数据
 * @date 2019-05-24 01:01
 * @see
 */
@Data
public class Paginator {

  /**
   * 分页数据-总量
   */
  private Integer total;

  /**
   * 分页数据-每页数据量
   */
  private Integer pageSize;

  /**
   * 分页数据-页码
   */
  private Integer pageNo;
}
