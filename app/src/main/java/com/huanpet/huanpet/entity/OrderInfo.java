package com.huanpet.huanpet.entity;

import java.io.Serializable;
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
public class OrderInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String orderId; // 订单id
	private String petId; // 宠物id
	private String usersId;// 寄养师id
	private String userId;// 用户id
	private String usersName;// 寄养师名�??
	private String usersImage;// 寄养师图�??
	private String usersAddress;// 寄养师地�??
	private double score;// 寄养师评�??
	private int orderState;// 订单状�??
	private Date serviceBeginTime;// 服务�??始时�??
	private Date serviceEndTime;// 服务结束时间
	private BigDecimal receivableAmount;// 应收金额
	private BigDecimal orderAmount;// 订单金额
	private BigDecimal paidUpAmount;// 实收金额
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间
	private String userWord;// 用户留言
	private String orderItemsInfo;// 订单详情
	private String usersInfo;// 寄养师详�??
	private String refuseReason;// 拒绝原因
	private String petUsersInfo;// 宠物寄养家庭信息

	public String getPetUsersInfo() {
		return petUsersInfo;
	}

	public void setPetUsersInfo(String petUsersInfo) {
		this.petUsersInfo = petUsersInfo;
	}

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

	public Date getServiceBeginTime() {
		return serviceBeginTime;
	}

	public void setServiceBeginTime(Date serviceBeginTime) {
		this.serviceBeginTime = serviceBeginTime;
	}

	public Date getServiceEndTime() {
		return serviceEndTime;
	}

	public void setServiceEndTime(Date serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
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

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getOrderItemsInfo() {
		return orderItemsInfo;
	}

	public void setOrderItemsInfo(String orderItemsInfo) {
		this.orderItemsInfo = orderItemsInfo;
	}

	public String getUsersInfo() {
		return usersInfo;
	}

	public void setUsersInfo(String usersInfo) {
		this.usersInfo = usersInfo;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersImage() {
		return usersImage;
	}

	public void setUsersImage(String usersImage) {
		this.usersImage = usersImage;
	}

	public String getUsersAddress() {
		return usersAddress;
	}

	public void setUsersAddress(String usersAddress) {
		this.usersAddress = usersAddress;
	}

	public BigDecimal getReceivableAmount() {
		return receivableAmount;
	}

	public void setReceivableAmount(BigDecimal receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", orderId=" + orderId + ", petId="
				+ petId + ", usersId=" + usersId + ", userId=" + userId
				+ ", usersName=" + usersName + ", usersImage=" + usersImage
				+ ", usersAddress=" + usersAddress + ", score=" + score
				+ ", orderState=" + orderState + ", serviceBeginTime="
				+ serviceBeginTime + ", serviceEndTime=" + serviceEndTime
				+ ", receivableAmount=" + receivableAmount + ", orderAmount="
				+ orderAmount + ", paidUpAmount=" + paidUpAmount
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", userWord=" + userWord + ", orderItemsInfo="
				+ orderItemsInfo + ", usersInfo=" + usersInfo
				+ ", refuseReason=" + refuseReason + ", petUsersInfo="
				+ petUsersInfo + "]";
	}

}
