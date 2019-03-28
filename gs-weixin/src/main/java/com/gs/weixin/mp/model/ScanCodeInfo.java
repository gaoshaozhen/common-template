package com.gs.weixin.mp.model;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.*;

/**
 * <pre>
 *  Created by BinaryWang on 2017/5/4.
 * </pre>
 *
 * @author Binary Wang
 */
@Setter
@Getter
@ToString
@JacksonXmlRootElement(localName = "ScanCodeInfo")
public class ScanCodeInfo implements Serializable {
  private static final long serialVersionUID = 4745181270645050122L;

  @JacksonXmlProperty(localName ="ScanType")
  private String scanType;
  
  @JacksonXmlProperty(localName ="ScanResult")
  private String scanResult;

}
