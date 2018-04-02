package com.huanpet.huanpet.entity;

import java.util.Date;

public class OrderOperLog {
	private Long id;

	private String orderId;// 订单Id

	private String createTime;

	private String createPerson;// 创建�??

	private String createPersonName;// 创建人名�??

	private Integer orderState;// 订单状�??

	private String refuseReason;// 拒绝信息

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreatePerson() {
		return createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson == null ? null : createPerson.trim();
	}

	public String getCreatePersonName() {
		return createPersonName;
	}

	public void setCreatePersonName(String createPersonName) {
		this.createPersonName = createPersonName == null ? null
				: createPersonName.trim();
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason == null ? null : refuseReason.trim();
	}
}