package com.bear.common.interchange.request;

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
   * 调用方需要透传的traceId（不需要业务方关心，由框架完成）
   */
  private String traceId;

}
