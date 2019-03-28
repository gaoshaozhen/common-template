package com.gs.weixin.mp.model.datacube;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * <pre>
 * 用户增减数据接口的返回JSON数据包
 * 详情查看文档：<a href="http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141082&token=&lang=zh_CN">用户分析数据接口</a>
 * </pre>
 */
@Data
public class WxDataCubeUserSummary implements Serializable {
  private static final long serialVersionUID = -2336654489906694173L;

  private Date refDate;

  private Integer userSource;

  private Integer newUser;

  private Integer cancelUser;

}
