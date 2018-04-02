package com.huanpet.huanpet.entity.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @Description:(订单详情信息实体)
 * @ClassName: OrderItemInfo
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-17 17:52:54
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class OrderItemInfoVO {
	private int id;
	private String orderId;// 订单id
	private String petId;// 宠物id
	private String petName;// 宠物名称
	private String petImage;// 宠物图片
	private String petPricingCode;// 宠物定价code
	private int petDuration;// 寄养时长
	private BigDecimal price;// 金额
	private String createTime;// 创建时间
	private String updateTime;// 修改时间
	private String serviceCode;// 服务code
	private String serviceName;// 服务名称
	private BigDecimal servicePrice;// 服务定价
	private String petPricingPrice;// 宠物定价
	private String serviceCount;// 服务�??
	private int isService; // 是否是服�??
	private String petPricingName; // 宠物服务名称

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

	public String getPetId() {
		return petId;
	}

	public String getPetPricingName() {
		return petPricingName;
	}

	public void setPetPricingName(String petPricingName) {
		this.petPricingName = petPricingName;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getPetPricingCode() {
		return petPricingCode;
	}

	public void setPetPricingCode(String petPricingCode) {
		this.petPricingCode = petPricingCode;
	}

	public int getPetDuration() {
		return petDuration;
	}

	public void setPetDuration(int petDuration) {
		this.petDuration = petDuration;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public BigDecimal getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetImage() {
		return petImage;
	}

	public void setPetImage(String petImage) {
		this.petImage = petImage;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getPetPricingPrice() {
		return petPricingPrice;
	}

	public void setPetPricingPrice(String petPricingPrice) {
		this.petPricingPrice = petPricingPrice;
	}

	public String getServiceCount() {
		return serviceCount;
	}

	public void setServiceCount(String serviceCount) {
		this.serviceCount = serviceCount;
	}

	public int getIsService() {
		return isService;
	}

	public void setIsService(int isService) {
		this.isService = isService;
	}

}
