package com.gs.weixin.mp.model.template;

import java.util.List;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Setter
@Getter
@ToString
public class WxMpTemplateList {
	
	@JsonProperty("template_list")
	private List<WxMpTemplate> templateList;
}
