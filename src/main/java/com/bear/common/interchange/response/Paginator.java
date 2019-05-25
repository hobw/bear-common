package com.bear.common.interchange.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author vam
 * @version 1.0
 *  分页数据
 * @date 2019-05-24 01:01
 *
 */
@Data
@Accessors(chain = true)
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
