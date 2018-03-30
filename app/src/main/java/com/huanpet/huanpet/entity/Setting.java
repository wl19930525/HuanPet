/**
 * @描述		:	
 * @作�??	    :Android - csx
 * @创建日期  :2016�??3�??12�?? 上午11:52:13  
 *
 */
package com.huanpet.huanpet.entity;

import java.io.Serializable;

/**
 * @描述 :设置账号实体
 * @作�?? :Android - csx
 * @创建日期 :2016�??3�??12�?? 上午11:52:13
 * 
 */
@SuppressWarnings("serial")
public class Setting implements Serializable {

	// id
	private int id;

	// 图片
	private String img = null;

	// 内容
	private String text = null;

	// 右边图片
	private String right = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

}
