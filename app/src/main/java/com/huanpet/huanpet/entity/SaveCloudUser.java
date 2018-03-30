/**   
 * @描述:	
 * @作�??:	Android - CXP
 * @创建日期:	2016�??4�??12�?? 下午5:50:34  
 */
package com.huanpet.huanpet.entity;

import java.io.Serializable;

/**
 * @描述: 云存储对�??
 * @作�??: Android - CXP
 * @创建日期: 2016�??4�??12�?? 下午5:50:34
 */
public class SaveCloudUser implements Serializable {

	private String _name;
	private String _location;
	private String _address;
	private String photo;
	private String usersId;
	private Integer state;
	private Integer _id;

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_location() {
		return _location;
	}

	public void set_location(String _location) {
		this._location = _location;
	}

	public String get_address() {
		return _address;
	}

	public void set_address(String _address) {
		this._address = _address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

}
