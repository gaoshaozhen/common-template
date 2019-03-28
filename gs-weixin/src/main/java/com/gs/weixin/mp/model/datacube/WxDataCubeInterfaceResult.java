package com.gs.weixin.mp.model.datacube;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口分析数据接口返回结果对象
 * <p>
 * Created by Binary Wang on 2016/8/30.
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WxDataCubeInterfaceResult extends WxDataCubeBaseResult {
  private static final long serialVersionUID = 597734329161281398L;

  /**
   * ref_hour
   * 数据的小时，包括从000到2300，分别代表的是[000,100)到[2300,2400)，即每日的第1小时和最后1小时
   */
  @JsonProperty("ref_hour")
  private Integer refHour;

  /**
   * callback_count
   * 通过服务器配置地址获得消息后，被动回复用户消息的次数
   */
  @JsonProperty("callback_count")
  private Integer callbackCount;

  /**
   * fail_count
   * 上述动作的失败次数
   */
  @JsonProperty("fail_count")
  private Integer failCount;

  /**
   * total_time_cost
   * 总耗时，除以callback_count即为平均耗时
   */
  @JsonProperty("total_time_cost")
  private Integer totalTimeCost;

  /**
   * max_time_cost
   * 最大耗时
   */
  @JsonProperty("max_time_cost")
  private Integer maxTimeCost;

}
