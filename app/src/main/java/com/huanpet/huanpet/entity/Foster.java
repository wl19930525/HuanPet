/**   
 * @描述:	
 * @作�??:	Android - CXP
 * @创建日期:	2016�??3�??14�?? 下午2:44:26  
 */
package com.huanpet.huanpet.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @描述:
 * @作�??: Android - CXP
 * @创建日期: 2016�??3�??14�?? 下午2:44:26
 */
public class Foster implements Serializable {

	// 地址
	private String address;
	// 价格
	private BigDecimal price;
	// 标题
	private String title;
	// 评价
	private float appraise;
	// 位置
	private String location;
	// 头像
	private String icon;
	// 用户Id
	private String userId;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getAppraise() {
		return appraise;
	}

	public void setAppraise(float appraise) {
		this.appraise = appraise;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
