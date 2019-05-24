package com.bear.common.interchange.response;

import java.util.List;

import lombok.Data;

/**
 * @author vam
 * @version 1.0
 * @desc
 * @date 2019-05-24 00:45
 * @see
 */
@Data
public class ListResult<T> extends BaseResult {

  /**
   * 分页信息
   */
  private Paginator paginator;

  /**
   * 列表数据
   */
  private List<T> data;

}
