package com.huanpet.huanpet.entity.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
 * @Description:(订单信息实体)
 * @ClassName: OrderInfo
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-17 11:24:23
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class OrderInfoVO {
	private int id;
	private String orderId; // 订单id
	private String usersId;// 寄养师id
	private String usersName;// 寄养师名�??
	private String userId;// 用户id
	private String userName;// 用户名称
	private int orderState;// 订单状�??
	private String serviceBeginTime;// 服务�??始时�??
	private String serviceEndTime;// 服务结束时间
	private BigDecimal orderAmount;// 订单金额
	private BigDecimal receivableAmount;// 应收金额
	private BigDecimal paidUpAmount;// 实收金额
	private String createTime;// 创建时间
	private String updateTime;// 更新时间
	private String userWord;// 用户留言
	private List<OrderItemInfoVO> orderItemInfoVOs;// 订单详情信息

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUsersId() {
		return usersId;
	}

	public void setUsers_id(String usersId) {
		this.usersId = usersId;
	}

	public int getOrderState() {
		return orderState;
	}

	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getPaidUpAmount() {
		return paidUpAmount;
	}

	public void setPaidUpAmount(BigDecimal paidUpAmount) {
		this.paidUpAmount = paidUpAmount;
	}

	public String getServiceBeginTime() {
		return serviceBeginTime;
	}

	public void setServiceBeginTime(String serviceBeginTime) {
		this.serviceBeginTime = serviceBeginTime;
	}

	public String getServiceEndTime() {
		return serviceEndTime;
	}

	public void setServiceEndTime(String serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUserWord() {
		return userWord;
	}

	public void setUserWord(String userWord) {
		this.userWord = userWord;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public List<OrderItemInfoVO> getOrderItemInfoVOs() {
		return orderItemInfoVOs;
	}

	public void setOrderItemInfoVOs(List<OrderItemInfoVO> orderItemInfoVOs) {
		this.orderItemInfoVOs = orderItemInfoVOs;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getReceivableAmount() {
		return receivableAmount;
	}

	public void setReceivableAmount(BigDecimal receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

}
