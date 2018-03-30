package com.huanpet.huanpet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @Description:(宠物定价信息VO)
 * @ClassName: PetPricingInfo
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-14 15:14:37
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class PetPricingInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private int petTypeCode;// 宠物类型code
	private String petTypeName;// 宠物类型名称
	private BigDecimal petPrice;// 价格
	private int unit;// 单位
	private int isUse;// 是否启用
	private Date createTime;// 创建时间
	private Date updateTime;// 修改时间
	private int bigType;
	private String userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPetTypeCode() {
		return petTypeCode;
	}

	public void setPetTypeCode(int petTypeCode) {
		this.petTypeCode = petTypeCode;
	}

	public String getPetTypeName() {
		return petTypeName;
	}

	public void setPetTypeName(String petTypeName) {
		this.petTypeName = petTypeName;
	}

	public BigDecimal getPetPrice() {
		return petPrice;
	}

	public void setPetPrice(BigDecimal petPrice) {
		this.petPrice = petPrice;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getBigType() {
		return bigType;
	}

	public void setBigType(int bigType) {
		this.bigType = bigType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
