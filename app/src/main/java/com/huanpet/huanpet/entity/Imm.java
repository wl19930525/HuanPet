/**
 * @描述		:	
 * @作�??	    :Android - csx
 * @创建日期  :2016�??4�??1�?? 上午11:47:20  
 *
 */
package com.huanpet.huanpet.entity;

import java.io.Serializable;

/**
 * @描述		:	
 * @作�??	    :Android - csx
 * @创建日期  :2016�??4�??1�?? 上午11:47:20  
 *
 */
/**
 * 
 * @描述 :上传的信息实�??
 * @作�?? :Android - csx
 * @创建日期 :2016�??4�??1�?? 上午9:20:46
 * 
 */
public class Imm implements Serializable {

	private String path = null;

	private String immuneCode = null;

	private String immuneName = null;

	private String immuneTime = null;

	private String petCode = null;

	private String petName = null;

	private String userId = null;

	private String userName = null;

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPetCode() {
		return petCode;
	}

	public void setPetCode(String petCode) {
		this.petCode = petCode;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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

	public String getImmuneTime() {
		return immuneTime;
	}

	public void setImmuneTime(String immuneTime) {
		this.immuneTime = immuneTime;
	}

}
