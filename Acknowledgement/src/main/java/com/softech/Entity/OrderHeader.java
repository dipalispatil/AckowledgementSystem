package com.softech.Entity;

import java.time.LocalDate;

public class OrderHeader {

	private int OrdId;
	private String userName;
	private String userMobileNo;
	private String purchaseOrdNo;
	private LocalDate purchaseOrdDate;
    private orderItems orderitems;
    private address addess;
	public int getOrdId() {
		return OrdId;
	}
	public void setOrdId(int ordId) {
		OrdId = ordId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getPurchaseOrdNo() {
		return purchaseOrdNo;
	}
	public void setPurchaseOrdNo(String purchaseOrdNo) {
		this.purchaseOrdNo = purchaseOrdNo;
	}
	public LocalDate getPurchaseOrdDate() {
		return purchaseOrdDate;
	}
	public void setPurchaseOrdDate(LocalDate purchaseOrdDate) {
		this.purchaseOrdDate = purchaseOrdDate;
	}
	public orderItems getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(orderItems orderitems) {
		this.orderitems = orderitems;
	}
	public address getAddess() {
		return addess;
	}
	public void setAddess(address addess) {
		this.addess = addess;
	}
	@Override
	public String toString() {
		return "OrderHeader [OrdId=" + OrdId + ", userName=" + userName + ", userMobileNo=" + userMobileNo
				+ ", purchaseOrdNo=" + purchaseOrdNo + ", purchaseOrdDate=" + purchaseOrdDate + ", orderitems="
				+ orderitems + ", addess=" + addess + "]";
	}
	public OrderHeader(int ordId, String userName, String userMobileNo, String purchaseOrdNo, LocalDate purchaseOrdDate,
			orderItems orderitems, address addess) {
		super();
		OrdId = ordId;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.purchaseOrdNo = purchaseOrdNo;
		this.purchaseOrdDate = purchaseOrdDate;
		this.orderitems = orderitems;
		this.addess = addess;
	}
    
    
}
