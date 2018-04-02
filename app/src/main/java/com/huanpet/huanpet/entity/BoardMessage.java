package com.huanpet.huanpet.entity;

public class BoardMessage {
	// ��������
	private String family;
	// �����Ǽ�(�����Ǽ�����Ҳ��֪������ɶ�Ǽ�)
	private String score;
	// ����
	private String distance;

	// ������ͼ۸�?
	private String price;
	// ����λ��
	private String address;
	// ������ͷ��
	private String userImage;
	// ����ʦId
	private String userId;
	// γ��
	private String coordY;
	// ����
	private String coordX;
	private String orderCount;

	public BoardMessage() {
		super();
	}

	public BoardMessage(String family, String score, String distance,
			String price, String address, String userImage, String userId,
			String coordY, String coordX, String orderCount) {
		super();
		this.family = family;
		this.score = score;
		this.distance = distance;
		this.price = price;
		this.address = address;
		this.userImage = userImage;
		this.userId = userId;
		this.coordY = coordY;
		this.coordX = coordX;
		this.orderCount = orderCount;
	}

	@Override
	public String toString() {
		return "BoardMessage [family=" + family + ", score=" + score
				+ ", distance=" + distance + ", price=" + price + ", address="
				+ address + ", userImage=" + userImage + ", userId=" + userId
				+ ", coordY=" + coordY + ", coordX=" + coordX + ", orderCount="
				+ orderCount + "]";
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCoordY() {
		return coordY;
	}

	public void setCoordY(String coordY) {
		this.coordY = coordY;
	}

	public String getCoordX() {
		return coordX;
	}

	public void setCoordX(String coordX) {
		this.coordX = coordX;
	}

	public String getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}

}
