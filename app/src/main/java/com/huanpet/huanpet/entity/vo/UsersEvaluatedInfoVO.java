package com.huanpet.huanpet.entity.vo;

import java.util.Date;

/**
 * 
 * @Description:(寄养师评价信息VO)
 * @ClassName: UsersEvaluatedInfoVO
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-17 19:34:56
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class UsersEvaluatedInfoVO {
	private int id;
	private String evaluatedCode;// 评价code n
	private String orderId;// 订单id
	private String userId;// 用户id
	private String usersId;// 寄养师id
	private double score;// 评分
	private String description;// 描述
	private int isUse;// 是否有效 n
	private Date createTime;// 评价时间 n
	private String userName;// 用户名称
	private String usersName;// 寄养师name
	private String userImage;// 用户图片
	private int petDuration;// 寄养时长
	private String petTypeDesc;// 宠物类型描述

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEvaluatedCode() {
		return evaluatedCode;
	}

	public void setEvaluatedCode(String evaluatedCode) {
		this.evaluatedCode = evaluatedCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
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
