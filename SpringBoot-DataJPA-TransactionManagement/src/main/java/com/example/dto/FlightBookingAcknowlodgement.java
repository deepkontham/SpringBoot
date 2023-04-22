package com.example.dto;

import com.example.entity.PassengerInfo;





public class FlightBookingAcknowlodgement {
	
	private String status;
	private double totalfree;
	private String pnro;
	private PassengerInfo info;
	public FlightBookingAcknowlodgement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightBookingAcknowlodgement(String status, double totalfree, String pnro, PassengerInfo info) {
		super();
		this.status = status;
		this.totalfree = totalfree;
		this.pnro = pnro;
		this.info = info;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalfree() {
		return totalfree;
	}
	public void setTotalfree(double totalfree) {
		this.totalfree = totalfree;
	}
	public String getPnro() {
		return pnro;
	}
	public void setPnro(String pnro) {
		this.pnro = pnro;
	}
	public PassengerInfo getInfo() {
		return info;
	}
	public void setInfo(PassengerInfo info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "FlightBookingAcknowlodgement [status=" + status + ", totalfree=" + totalfree + ", pnro=" + pnro
				+ ", info=" + info + "]";
	}
	
	
	 
	
	

}
