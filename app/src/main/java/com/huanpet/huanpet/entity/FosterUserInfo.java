package com.huanpet.huanpet.entity;

import java.io.Serializable;
import java.util.List;

public class FosterUserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	// 返回寄养师星�??
	private Double fosterGrade;
	// 寄养师个人信�??
	private UserInfo fosterInfo;
	// 图片集合
	private List<UsersImageInfo> fosterImages;
	// 返回寄养师评论�?�数
	private Integer fosterCommentCount;
	// 返回寄养师其他服务集�??
	private List<ServicePricingInfo> fosterOtherServices;
	// 寄养师服务集�??
	private List<PetType> fosterServices;

	public Double getFosterGrade() {
		return fosterGrade;
	}

	public void setFosterGrade(Double fosterGrade) {
		this.fosterGrade = fosterGrade;
	}

	public List<UsersImageInfo> getFosterImages() {
		return fosterImages;
	}

	public void setFosterImages(List<UsersImageInfo> fosterImages) {
		this.fosterImages = fosterImages;
	}

	public UserInfo getFosterInfo() {
		return fosterInfo;
	}

	public void setFosterInfo(UserInfo fosterInfo) {
		this.fosterInfo = fosterInfo;
	}

	public List<PetType> getFosterServices() {
		return fosterServices;
	}

	public void setFosterServices(List<PetType> fosterServices) {
		this.fosterServices = fosterServices;
	}

	public List<ServicePricingInfo> getFosterOtherServices() {
		return fosterOtherServices;
	}

	public void setFosterOtherServices(
			List<ServicePricingInfo> fosterOtherServices) {
		this.fosterOtherServices = fosterOtherServices;
	}

	public Integer getFosterCommentCount() {
		return fosterCommentCount;
	}

	public void setFosterCommentCount(Integer fosterCommentCount) {
		this.fosterCommentCount = fosterCommentCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
