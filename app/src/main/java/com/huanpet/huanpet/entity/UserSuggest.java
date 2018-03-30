package com.huanpet.huanpet.entity;

/**
 * ClassName: UserSuggest
 * 
 * @Description: 用户建议
 * @author maoruiwen
 * @date 2016�??4�??20�??
 */
public class UserSuggest {
	private String userId;// 用户id
	private String userName;// 用户�??
	private String createTime;// 创建时间
	private String suggest;// 建议

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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
}
