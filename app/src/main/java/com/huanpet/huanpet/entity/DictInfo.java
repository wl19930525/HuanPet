package com.huanpet.huanpet.entity;

import java.io.Serializable;

/**
 * 
 * @Description:(数据字典实体)
 * @ClassName: DictInfo
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-20 09:27:49
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class DictInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String dictKey;// 字典标识key
	private String dictValue;// 字典标识value
	private int isUse;// 是否启用

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDictKey() {
		return dictKey;
	}

	public void setDictKey(String dictKey) {
		this.dictKey = dictKey;
	}

	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
}
