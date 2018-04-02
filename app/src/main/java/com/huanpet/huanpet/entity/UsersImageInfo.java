package com.huanpet.huanpet.entity;

import java.io.Serializable;

/**
 * 
 * @Description:(寄养师图片实�??)
 * @ClassName: UsersImageInfo
 * @author zf zhangfeng@tctogether.com
 * @date 2016-04-05 11:54:14
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class UsersImageInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String usersId; // 寄养师id
	private String createTime; // 创建时间
	private String ImageType; // 图片类型
	private String ImageUrl; // 图片路径

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getImageType() {
		return ImageType;
	}

	public void setImageType(String imageType) {
		ImageType = imageType;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
}
