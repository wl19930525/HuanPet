package com.huanpet.huanpet.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @Description:(消息记录实体)
 * @ClassName: MessageLog
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-17 21:00:24
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class MessageLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String fromUserId;// 发�?�用�??
	private String toUserId;// 接受用户
	private int messageType;// 消息类型
	private String messageInfo;// 消息内容
	private Date createTime;// 创建时间

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public int getMessageType() {
		return messageType;
	}

	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}

	public String getMessageInfo() {
		return messageInfo;
	}

	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
