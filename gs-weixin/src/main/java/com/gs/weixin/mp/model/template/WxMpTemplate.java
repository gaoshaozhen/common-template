package com.gs.weixin.mp.model.template;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * 模板列表信息
 * Created by Binary Wang on 2016-10-17.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
@JacksonXmlRootElement(localName ="xml")
public class WxMpTemplate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * template_id
   * 模板ID
   */
  @JacksonXmlProperty(localName ="template_id")
  private String templateId;
  /**
   * title
   * 模板标题
   */
  @JacksonXmlProperty(localName ="title")
  private String title;
  /**
   * primary_industry
   * 模板所属行业的一级行业
   */
  @JacksonXmlProperty(localName ="primary_industry")
  private String primaryIndustry;
  /**
   * deputy_industry
   * 模板所属行业的二级行业
   */
  @JacksonXmlProperty(localName ="deputy_industry")
  private String deputyIndustry;
  /**
   * content
   * 模板内容
   */
  @JacksonXmlProperty(localName ="content")
  private String content;
  /**
   * example
   * 模板示例
   */
  @JacksonXmlProperty(localName ="example")
  private String example;

}
