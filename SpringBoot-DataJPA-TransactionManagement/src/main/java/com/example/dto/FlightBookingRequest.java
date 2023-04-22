package com.example.dto;

import com.example.entity.PassengerInfo;
import com.example.entity.Paymentinfo;



public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	private Paymentinfo paymentinfo;

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public Paymentinfo getPaymentinfo() {
		return paymentinfo;
	}

	public void setPaymentinfo(Paymentinfo paymentinfo) {
		this.paymentinfo = paymentinfo;
	}

	@Override
	public String toString() {
		return "FlightBookingRequest [passengerInfo=" + passengerInfo + ", paymentinfo=" + paymentinfo + "]";
	}

}
