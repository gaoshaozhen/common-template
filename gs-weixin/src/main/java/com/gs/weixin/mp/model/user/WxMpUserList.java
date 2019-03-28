package com.gs.weixin.mp.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 关注者列表
 *
 * @author chanjarster
 */
@Data
public class WxMpUserList implements Serializable {
  private static final long serialVersionUID = 1389073042674901032L;

  protected long total = -1;
  protected int count = -1;
  protected List<String> openids = new ArrayList<>();
  protected String nextOpenid;

}
