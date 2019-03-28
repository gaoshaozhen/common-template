package com.gs.weixin.mp.service.impl;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gs.weixin.mp.WxApi;
import com.gs.weixin.mp.model.datacube.*;
import com.gs.weixin.mp.service.WxMpDataCubeService;
import com.gs.weixin.mp.service.WxMpService;

public class WxMpDataCubeServiceImpl implements WxMpDataCubeService {

  private WxMpService wxMpService;

  public WxMpDataCubeServiceImpl(WxMpService wxMpService) {
    this.wxMpService = wxMpService;
  }

  @Override
  public List<WxDataCubeUserSummary> getUserSummary(Date beginDate, Date endDate) {
	 return wxMpService.executeByPost(WxApi.GET_USER_SUMMARY, new TypeReference<WxDataCubeUserSummaryList>() {}, new WxDataCubeParam(beginDate, endDate)).getList();
  }

  @Override
  public List<WxDataCubeUserCumulate> getUserCumulate(Date beginDate, Date endDate) {
	  return wxMpService.executeByPost(WxApi.GET_USER_CUMULATE, new TypeReference<WxDataCubeUserCumulateList>() {}, new WxDataCubeParam(beginDate, endDate)).getList();
  }

  @Override
  public List<WxDataCubeArticleResult> getArticleSummary(Date beginDate, Date endDate) {
    return this.getArticleResults(WxApi.GET_ARTICLE_SUMMARY, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeArticleTotal> getArticleTotal(Date beginDate, Date endDate) {
	  return wxMpService.executeByPost(WxApi.GET_ARTICLE_TOTAL, new TypeReference<WxDataCubeArticleTotalList>() {}, new WxDataCubeParam(beginDate, endDate)).getList();
  }

  @Override
  public List<WxDataCubeArticleResult> getUserRead(Date beginDate, Date endDate) {
    return this.getArticleResults(WxApi.GET_USER_READ, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeArticleResult> getUserReadHour(Date beginDate, Date endDate) {
    return this.getArticleResults(WxApi.GET_USER_READ_HOUR, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeArticleResult> getUserShare(Date beginDate, Date endDate) {
    return this.getArticleResults(WxApi.GET_USER_SHARE, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeArticleResult> getUserShareHour(Date beginDate, Date endDate) {
    return this.getArticleResults(WxApi.GET_USER_SHARE_HOUR, beginDate, endDate);
  }

  private List<WxDataCubeArticleResult> getArticleResults(String url, Date beginDate, Date endDate) {
	  return wxMpService.executeByPost(url, new TypeReference<WxDataCubeArticleResultList>() {}, new WxDataCubeParam(beginDate, endDate)).getList();
  }

  @Override
  public List<WxDataCubeMsgResult> getUpstreamMsg(Date beginDate, Date endDate) {
    return this.getUpstreamMsg(WxApi.GET_UPSTREAM_MSG, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeMsgResult> getUpstreamMsgHour(Date beginDate, Date endDate) {
    return this.getUpstreamMsg(WxApi.GET_UPSTREAM_MSG_HOUR, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeMsgResult> getUpstreamMsgWeek(Date beginDate, Date endDate) {
    return this.getUpstreamMsg(WxApi.GET_UPSTREAM_MSG_WEEK, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeMsgResult> getUpstreamMsgMonth(Date beginDate, Date endDate) {
    return this.getUpstreamMsg(WxApi.GET_UPSTREAM_MSG_MONTH, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeMsgResult> getUpstreamMsgDist(Date beginDate, Date endDate) {
    return this.getUpstreamMsg(WxApi.GET_UPSTREAM_MSG_DIST, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeMsgResult> getUpstreamMsgDistWeek(Date beginDate, Date endDate) {
    return this.getUpstreamMsg(WxApi.GET_UPSTREAM_MSG_DIST_WEEK, beginDate, endDate);
  }

  @Override
  public List<WxDataCubeMsgResult> getUpstreamMsgDistMonth(Date beginDate, Date endDate) {
    return this.getUpstreamMsg(WxApi.GET_UPSTREAM_MSG_DIST_MONTH, beginDate, endDate);
  }

  private List<WxDataCubeMsgResult> getUpstreamMsg(String url, Date beginDate, Date endDate) {
	  return wxMpService.executeByPost(url, new TypeReference<WxDataCubeMsgResultList>() {}, new WxDataCubeParam(beginDate, endDate)).getList();
  }

  @Override
  public List<WxDataCubeInterfaceResult> getInterfaceSummary(Date beginDate, Date endDate) {
	return wxMpService.executeByPost(WxApi.GET_INTERFACE_SUMMARY, new TypeReference<WxDataCubeInterfaceResultList>() {}, new WxDataCubeParam(beginDate, endDate)).getList();
  }

  @Override
  public List<WxDataCubeInterfaceResult> getInterfaceSummaryHour(Date beginDate,                                                                 Date endDate) {
	  return wxMpService.executeByPost(WxApi.GET_INTERFACE_SUMMARY_HOUR, new TypeReference<WxDataCubeInterfaceResultList>() {}, new WxDataCubeParam(beginDate, endDate)).getList();
  }
}
