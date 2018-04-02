package com.huanpet.huanpet.entity;

import java.util.Date;

/**
 * 
 * @Description:(宠物免疫信息实体VO)
 * @ClassName: PetImmuneInfoVO
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-17 11:06:02
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class PetImmuneInfo {
	private int id;
	private String immuneCode;// 免疫code
	private String immuneName;// 免疫名称
	private String petCode;// 宠物code
	private String immuneTime;// 免疫时间
	private int isStandard;// 是否标准
	private int state; // 免疫状�??

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImmuneCode() {
		return immuneCode;
	}

	public void setImmuneCode(String immuneCode) {
		this.immuneCode = immuneCode;
	}

	public String getImmuneName() {
		return immuneName;
	}

	public void setImmuneName(String immuneName) {
		this.immuneName = immuneName;
	}

	public String getPetCode() {
		return petCode;
	}

	public void setPetCode(String petCode) {
		this.petCode = petCode;
	}

	public String getImmuneTime() {
		return immuneTime;
	}

	public void setImmuneTime(String immuneTime) {
		this.immuneTime = immuneTime;
	}

	public int getIsStandard() {
		return isStandard;
	}

	public void setIsStandard(int isStandard) {
		this.isStandard = isStandard;
	}
}
