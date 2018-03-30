package com.huanpet.huanpet.entity;

import com.huanpet.huanpet.entity.vo.ServicePricingInfoVO;

import java.util.List;



public class ServiceInfoVO {

	private String beginIndex;
	private String endIndex;
	private String coordX;
	private String coordY;
	private List<ServicePricingInfoVO> serviceCodes;

	public String getBeginIndex() {
		return beginIndex;
	}

	public void setBeginIndex(String beginIndex) {
		this.beginIndex = beginIndex;
	}

	public String getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(String endIndex) {
		this.endIndex = endIndex;
	}

	public String getCoordX() {
		return coordX;
	}

	public void setCoordX(String coordX) {
		this.coordX = coordX;
	}

	public String getCoordY() {
		return coordY;
	}

	public void setCoordY(String coordY) {
		this.coordY = coordY;
	}

	public List<ServicePricingInfoVO> getServiceCodes() {
		return serviceCodes;
	}

	public void setServiceCodes(List<ServicePricingInfoVO> serviceCodes) {
		this.serviceCodes = serviceCodes;
	}

}
