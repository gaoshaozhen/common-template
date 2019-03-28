package com.gs.weixin.mp.model.datacube;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <pre>
 *  统计接口的共用属性类.
 *  Created by Binary Wang on 2016/8/25.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
public abstract class WxDataCubeBaseResult implements Serializable {
  private static final long serialVersionUID = 8780389911053297600L;

  /**
   * ref_date.
   * 数据的日期，需在begin_date和end_date之间
   */
  @JsonProperty("ref_date")
  private String refDate;

}
