package com.huanpet.huanpet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @Description:(支付日志实体)
 * @ClassName: PayLog
 * @author zf zhangfeng@tctogether.com
 * @date 2016-03-17 20:10:55
 *       <p>
 *       北京天成合科�??有限公司版权�??�??
 *       </p>
 */
public class PayLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String userId;// 用户id
	private Date createTime;// 创建时间
	private int payType;// 支付类型
	private BigDecimal price;// 支付金额

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
