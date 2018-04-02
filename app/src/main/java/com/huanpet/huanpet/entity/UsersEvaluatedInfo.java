package com.huanpet.huanpet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @Description:(寄养师评价信息实�??)
 * @ClassName: UsersEvaluatedInfo
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-17 19:34:56
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class UsersEvaluatedInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String evaluatedCode;// 评价code
	private String orderId;// 订单id
	private String userId;// 用户id
	private String usersId;// 寄养师id
	private String userName;// 用户�??
	private double score;// 评分
	private String description;// 描述
	private int isUse;// 是否有效
	private String createTime;// 评价时间
	private String petId;// 宠物id
	private BigDecimal price;// �??低价�??
	private int orderCount;// 订单�??
	private int evaluatedCount;// 评论人数
	private String userImage;// 用户图片
	private int petDuration;// 寄养时长
	private String petTypeDesc;// 宠物类型描述

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getEvaluatedCode() {
		return evaluatedCode;
	}

	public void setEvaluatedCode(String evaluatedCode) {
		this.evaluatedCode = evaluatedCode;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public int getEvaluatedCount() {
		return evaluatedCount;
	}

	public void setEvaluatedCount(int evaluatedCount) {
		this.evaluatedCount = evaluatedCount;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public int getPetDuration() {
		return petDuration;
	}

	public void setPetDuration(int petDuration) {
		this.petDuration = petDuration;
	}

	public String getPetTypeDesc() {
		return petTypeDesc;
	}

	public void setPetTypeDesc(String petTypeDesc) {
		this.petTypeDesc = petTypeDesc;
	}
}
