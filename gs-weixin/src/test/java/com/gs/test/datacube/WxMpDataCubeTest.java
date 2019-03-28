package com.gs.test.datacube;

import java.text.ParseException;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gs.weixin.WxApp;
import com.gs.weixin.mp.config.WxMpConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes=WxApp.class)
public class WxMpDataCubeTest {
	
	@Autowired
	private WxMpConfig wxMpConfig;
	
	private static Date beginDate;
	private static Date endDate;
	
	static {
		try {
			beginDate = DateUtils.parseDate("2018-01-01", "yyyy-MM-dd");
			endDate = DateUtils.parseDate("2018-01-01", "yyyy-MM-dd");		
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testWxMpDataCubeServiceImpl() {
		
	}

	@Test
	public void testGetUserSummary() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUserSummary(beginDate, endDate);
	}

	@Test
	public void testGetUserCumulate() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUserCumulate(beginDate, endDate);
	}

	@Test
	public void testGetArticleSummary() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getArticleSummary(beginDate, endDate);
	}

	@Test
	public void testGetArticleTotal() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getArticleTotal(beginDate, endDate);
	}

	@Test
	public void testGetUserRead() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUserRead(beginDate, endDate);
	}

	@Test
	public void testGetUserReadHour() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUserReadHour(beginDate, endDate);
	}

	@Test
	public void testGetUserShare() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUserShare(beginDate, endDate);
	}

	@Test
	public void testGetUserShareHour() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUserShareHour(beginDate, endDate);
	}

	@Test
	public void testGetUpstreamMsg() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUpstreamMsg(beginDate, endDate);
	}

	@Test
	public void testGetUpstreamMsgHour() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUpstreamMsgHour(beginDate, endDate);
	}

	@Test
	public void testGetUpstreamMsgWeek() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUpstreamMsgWeek(beginDate, endDate);
	}

	@Test
	public void testGetUpstreamMsgMonth() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUpstreamMsgMonth(beginDate, endDate);
	}

	@Test
	public void testGetUpstreamMsgDist() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUpstreamMsgDist(beginDate, endDate);
	}

	@Test
	public void testGetUpstreamMsgDistWeek() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUpstreamMsgDistWeek(beginDate, endDate);
	}

	@Test
	public void testGetUpstreamMsgDistMonth() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getUpstreamMsgDistMonth(beginDate, endDate);
	}

	@Test
	public void testGetInterfaceSummary() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getInterfaceSummary(beginDate, endDate);
	}

	@Test
	public void testGetInterfaceSummaryHour() {
		wxMpConfig.getWxMpService().getWxMpDataCubeService().getInterfaceSummaryHour(beginDate, endDate);
	}
}
