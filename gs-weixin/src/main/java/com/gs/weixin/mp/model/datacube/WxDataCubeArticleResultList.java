package com.gs.weixin.mp.model.datacube;

import java.util.List;

import lombok.Data;

/**
 * 图文分析数据接口返回结果对象
 * <p>
 * Created by Binary Wang on 2016/8/24.
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
public class WxDataCubeArticleResultList{
	
	List<WxDataCubeArticleResult> list;
}
