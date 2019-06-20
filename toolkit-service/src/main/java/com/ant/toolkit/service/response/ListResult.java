package com.ant.toolkit.service.response;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author vam
 * @version 1.0
 *
 * @date 2019-05-24 00:45
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
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
