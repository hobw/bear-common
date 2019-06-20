package com.ant.toolkit.service.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author vam
 * @version 1.0
 *  响应基类
 * @date 2019-05-24 00:46
 *
 */
@Data
@Accessors(chain = true)
public class BaseResult implements Serializable {

  /**
   * 响应是否成功，无论成功与否，该值都会存在
   */
  private Boolean success;

  /**
   * 表示错误代码
   */
  private Integer code;

  /**
   * 结果信息
   */
  private String message;

  /**
   * 业务处理方返回的业务执行id,用于业务方跟踪业务执行情况,非必须
   */
  private String processId;
}
