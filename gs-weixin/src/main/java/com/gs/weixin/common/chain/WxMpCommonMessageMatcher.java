package com.gs.weixin.common.chain;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import com.gs.weixin.mp.model.WxMpCommonMessage;

import lombok.*;

@Setter
@Getter
@Component
public class WxMpCommonMessageMatcher {
	private String fromUser;

	private String msgType;

	private String event;

	private String eventKey;

	private String eventKeyRegex;

	private String content;

	public boolean test(WxMpCommonMessage wxMessage) {
		return (this.fromUser == null || this.fromUser.equals(wxMessage.getFromUser()))
				&& (this.msgType == null || this.msgType.equalsIgnoreCase(wxMessage.getMsgType()))
				&& (this.event == null || this.event.equalsIgnoreCase(wxMessage.getEvent()))
				&& (this.eventKey == null || this.eventKey.equalsIgnoreCase(wxMessage.getEventKey()))
				&& (this.eventKeyRegex == null
						|| Pattern.matches(this.eventKeyRegex, StringUtils.trimToEmpty(wxMessage.getEventKey())))
				&& (this.content == null || this.content.equals(StringUtils.trimToNull(wxMessage.getContent())));
	}
}
