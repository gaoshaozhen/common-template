package com.gs.weixin.mp.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WxMpCommonMessage {

	  @JacksonXmlProperty(localName ="ToUserName")
	  private String toUser;

	  @JacksonXmlProperty(localName ="FromUserName")
	  private String fromUser;

	  @JacksonXmlProperty(localName ="CreateTime")
	  private Long createTime;

	  @JacksonXmlProperty(localName ="MsgType")
	  private String msgType;

	  @JacksonXmlProperty(localName ="Content")
	  private String content;

	  @JacksonXmlProperty(localName ="MenuId")
	  private Long menuId;

	  @JacksonXmlProperty(localName ="MsgId")
	  private Long msgId;

	  @JacksonXmlProperty(localName ="PicUrl")
	  private String picUrl;

	  @JacksonXmlProperty(localName ="MediaId")
	  private String mediaId;

	  @JacksonXmlProperty(localName ="Format")
	  private String format;

	  @JacksonXmlProperty(localName ="ThumbMediaId")
	  private String thumbMediaId;

	  @JacksonXmlProperty(localName ="Location_X")
	  private Double locationX;

	  @JacksonXmlProperty(localName ="Location_Y")
	  private Double locationY;

	  @JacksonXmlProperty(localName ="Scale")
	  private Double scale;

	  @JacksonXmlProperty(localName ="Label")
	  private String label;

	  @JacksonXmlProperty(localName ="Title")
	  private String title;

	  @JacksonXmlProperty(localName ="Description")
	  private String description;

	  @JacksonXmlProperty(localName ="Url")
	  private String url;

	  @JacksonXmlProperty(localName ="Event")
	  private String event;

	  @JacksonXmlProperty(localName ="EventKey")
	  private String eventKey;

	  @JacksonXmlProperty(localName ="Ticket")
	  private String ticket;

	  @JacksonXmlProperty(localName ="Latitude")
	  private Double latitude;

	  @JacksonXmlProperty(localName ="Longitude")
	  private Double longitude;

	  @JacksonXmlProperty(localName ="Precision")
	  private Double precision;

	  @JacksonXmlProperty(localName ="Recognition")
	  private String recognition;

	  ///////////////////////////////////////
	  // 群发消息返回的结果
	  ///////////////////////////////////////
	  /**
	   * 群发的结果
	   */
	  @JacksonXmlProperty(localName ="Status")
	  private String status;
	  /**
	   * group_id下粉丝数；或者openid_list中的粉丝数
	   */
	  @JacksonXmlProperty(localName ="TotalCount")
	  private Integer totalCount;
	  /**
	   * 过滤（过滤是指特定地区、性别的过滤、用户设置拒收的过滤，用户接收已超4条的过滤）后，准备发送的粉丝数，原则上，filterCount = sentCount + errorCount
	   */
	  @JacksonXmlProperty(localName ="FilterCount")
	  private Integer filterCount;
	  /**
	   * 发送成功的粉丝数
	   */
	  @JacksonXmlProperty(localName ="SentCount")
	  private Integer sentCount;
	  /**
	   * 发送失败的粉丝数
	   */
	  @JacksonXmlProperty(localName ="ErrorCount")
	  private Integer errorCount;

	  ///////////////////////////////////////
	  // 客服会话管理相关事件推送
	  ///////////////////////////////////////
	  /**
	   * 创建或关闭客服会话时的客服帐号
	   */
	  @JacksonXmlProperty(localName ="KfAccount")
	  private String kfAccount;
	  /**
	   * 转接客服会话时的转入客服帐号
	   */
	  @JacksonXmlProperty(localName ="ToKfAccount")
	  private String toKfAccount;
	  /**
	   * 转接客服会话时的转出客服帐号
	   */
	  @JacksonXmlProperty(localName ="FromKfAccount")
	  private String fromKfAccount;

	  ///////////////////////////////////////
	  // 卡券相关事件推送
	  ///////////////////////////////////////
	  @JacksonXmlProperty(localName ="CardId")
	  private String cardId;

	  @JacksonXmlProperty(localName ="FriendUserName")
	  private String friendUserName;

	  @JacksonXmlProperty(localName ="IsGiveByFriend")
	  private Integer isGiveByFriend; // 是否为转赠，1代表是，0代表否

	  @JacksonXmlProperty(localName ="UserCardCode")
	  private String userCardCode;

	  @JacksonXmlProperty(localName ="OldUserCardCode")
	  private String oldUserCardCode;

	  @JacksonXmlProperty(localName ="OuterId")
	  private Integer outerId;

	  /**
	   * 用户删除会员卡后可重新找回，当用户本次操作为找回时，该值为1，否则为0
	   */
	  @JacksonXmlProperty(localName ="IsRestoreMemberCard")
	  private String isRestoreMemberCard;

	  /**
	   * <pre>
	   * 领取场景值，用于领取渠道数据统计。可在生成二维码接口及添加Addcard接口中自定义该字段的字符串值。
	   * 核销卡券时：开发者发起核销时传入的自定义参数，用于进行核销渠道统计
	   * 另外：
	   * 官网文档中，微信卡券>>卡券事件推送>>2.7 进入会员卡事件推送 user_view_card
	   * OuterStr：商户自定义二维码渠道参数，用于标识本次扫码打开会员卡来源来自于某个渠道值的二维码
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="OuterStr")
	  private String outerStr;

	  /**
	   * 是否转赠退回，0代表不是，1代表是。
	   */
	  @JacksonXmlProperty(localName ="IsReturnBack")
	  private String isReturnBack;

	  /**
	   * 是否是群转赠，0代表不是，1代表是。
	   */
	  @JacksonXmlProperty(localName ="IsChatRoom")
	  private String isChatRoom;

	  /**
	   * 核销来源。支持开发者统计API核销（FROM_API）、公众平台核销（FROM_MP）、卡券商户助手核销（FROM_MOBILE_HELPER）（核销员微信号）
	   */
	  @JacksonXmlProperty(localName ="ConsumeSource")
	  private String consumeSource;

	  /**
	   * 门店名称，当前卡券核销的门店名称（只有通过自助核销和买单核销时才会出现该字段）
	   */
	  @JacksonXmlProperty(localName ="LocationName")
	  private String locationName;

	  /**
	   * 核销该卡券核销员的openid（只有通过卡券商户助手核销时才会出现）
	   */
	  @JacksonXmlProperty(localName ="StaffOpenId")
	  private String staffOpenId;

	  /**
	   * 自助核销时，用户输入的验证码
	   */
	  @JacksonXmlProperty(localName ="VerifyCode")
	  private String verifyCode;

	  /**
	   * 自助核销时，用户输入的备注金额
	   */
	  @JacksonXmlProperty(localName ="RemarkAmount")
	  private String remarkAmount;

	  /**
	   * <pre>
	   * 官网文档中，微信卡券>>卡券事件推送>>2.10 库存报警事件card_sku_remind
	   * Detail：报警详细信息
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="Detail")
	  private String detail;

	  /**
	   * <pre>
	   * 官网文档中，微信卡券>>卡券事件推送>>2.9 会员卡内容更新事件 update_member_card
	   * ModifyBonus：变动的积分值
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="ModifyBonus")
	  private String modifyBonus;

	  /**
	   * <pre>
	   * 官网文档中，微信卡券>>卡券事件推送>>2.9 会员卡内容更新事件 update_member_card
	   * ModifyBalance：变动的余额值
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="ModifyBalance")
	  private String modifyBalance;

	  /**
	   * <pre>
	   * 官网文档中，微信卡券>>卡券事件推送>>2.6 买单事件推送 User_pay_from_pay_cell
	   * TransId：微信支付交易订单号（只有使用买单功能核销的卡券才会出现）
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="TransId")
	  private String transId;

	  /**
	   * <pre>
	   * 官网文档中，微信卡券>>卡券事件推送>>2.6 买单事件推送 User_pay_from_pay_cell
	   * LocationId：门店ID，当前卡券核销的门店ID（只有通过卡券商户助手和买单核销时才会出现）
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="LocationId")
	  private String locationId;

	  /**
	   * <pre>
	   * 官网文档中，微信卡券>>卡券事件推送>>2.6 买单事件推送 User_pay_from_pay_cell
	   * Fee：实付金额，单位为分
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="Fee")
	  private String fee;

	  /**
	   * <pre>
	   * 官网文档中，微信卡券>>卡券事件推送>>2.6 买单事件推送 User_pay_from_pay_cell
	   * OriginalFee：应付金额，单位为分
	   * </pre>
	   */
	  @JacksonXmlProperty(localName ="OriginalFee")
	  private String originalFee;

	  @JacksonXmlProperty(localName ="ScanCodeInfo")
	  private ScanCodeInfo scanCodeInfo = new ScanCodeInfo();

	  @JacksonXmlProperty(localName ="SendPicsInfo")
	  private SendPicsInfo sendPicsInfo = new SendPicsInfo();

	  @JacksonXmlProperty(localName ="SendLocationInfo")
	  private SendLocationInfo sendLocationInfo = new SendLocationInfo();

	  ///////////////////////////////////////
	  // 门店审核事件推送
	  ///////////////////////////////////////
	  /**
	   * UniqId
	   * 商户自己内部ID，即字段中的sid
	   */
	  @JacksonXmlProperty(localName ="UniqId")
	  private String storeUniqId;

	  /**
	   * PoiId
	   * 微信的门店ID，微信内门店唯一标示ID
	   */
	  @JacksonXmlProperty(localName ="PoiId")
	  private String poiId;

	  /**
	   * Result
	   * 审核结果，成功succ 或失败fail
	   */
	  @JacksonXmlProperty(localName ="Result")
	  private String result;

	  /**
	   * msg
	   * 成功的通知信息，或审核失败的驳回理由
	   */
	  @JacksonXmlProperty(localName ="msg")
	  private String msg;

	  ///////////////////////////////////////
	  // 微信认证事件推送
	  ///////////////////////////////////////
	  /**
	   * ExpiredTime
	   * 资质认证成功/名称认证成功: 有效期 (整形)，指的是时间戳，将于该时间戳认证过期
	   * 年审通知: 有效期 (整形)，指的是时间戳，将于该时间戳认证过期，需尽快年审
	   * 认证过期失效通知: 有效期 (整形)，指的是时间戳，表示已于该时间戳认证过期，需要重新发起微信认证
	   */
	  @JacksonXmlProperty(localName ="ExpiredTime")
	  private Long expiredTime;
	  /**
	   * FailTime
	   * 失败发生时间 (整形)，时间戳
	   */
	  @JacksonXmlProperty(localName ="FailTime")
	  private Long failTime;
	  /**
	   * FailReason
	   * 认证失败的原因
	   */
	  @JacksonXmlProperty(localName ="FailReason")
	  private String failReason;


	  ///////////////////////////////////////
	  // 微信硬件平台相关事件推送
	  ///////////////////////////////////////
	  /**
	   * 设备类型，目前为"公众账号原始ID"
	   */
	  @JacksonXmlProperty(localName ="DeviceType")
	  private String deviceType;

	  /**
	   * 设备ID，第三方提供
	   */
	  @JacksonXmlProperty(localName ="DeviceID")
	  private String deviceId;

	  /**
	   * 微信用户账号的OpenID
	   */
	  @JacksonXmlProperty(localName ="OpenID")
	   
	  private String openId;

	  @JacksonXmlProperty(localName ="HardWare")
	  private HardWare hardWare = new HardWare();

	  /**
	   * 请求类型：0：退订设备状态；1：心跳；（心跳的处理方式跟订阅一样）2：订阅设备状态
	   */
	  @JacksonXmlProperty(localName ="OpType")
	  private Integer opType;

	  /**
	   * 设备状态：0：未连接；1：已连接
	   */
	  @JacksonXmlProperty(localName ="DeviceStatus")
	  private Integer deviceStatus;
}
