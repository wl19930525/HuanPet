package com.huanpet.huanpet.entity.vo;

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
public class PetImmuneInfoVO {
	private int id;
	private String immuneCode;// 免疫code
	private String immuneName;// 免疫名称
	private String petCode;// 宠物code
	private String petName;// 宠物名称
	private String userId;// 用户id
	private String userName;// 用户名称
	private String immuneTime;// 免疫时间
	private int isStandard;// 是否标准
	private int state;// 状�??
	private int isUse;// 启用

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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
