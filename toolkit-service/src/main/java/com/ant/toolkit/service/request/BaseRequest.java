package com.ant.toolkit.service.request;

import java.io.Serializable;
import lombok.Data;

/**
 * @author vam
 * @version 1.0
 *  请求基类
 * @date 2019-05-24 00:44
 *
 */
@Data
public class BaseRequest implements Serializable {


  /**
   * 组织(公司)id
   */
  private Long holeId;

  /**
   * 操作人ID
   */
  private Long antId;

  /**
   * 调用来源
   */
  private String resourse;

}
