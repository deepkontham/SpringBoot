package com.example.entity;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "passenger_tbl")
public class PassengerInfo {

	@Id
	@GeneratedValue
	private Long passengerid;
	private String name;
	private String email;
	private String source;
	private String destination;
	private Date traveldate;
	private String pickuptime;
	private String arrivaltime;
	private double fare;
	public Long getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(Long passengerid) {
		this.passengerid = passengerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	public String getPickuptime() {
		return pickuptime;
	}
	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "PassengerInfo [passengerid=" + passengerid + ", name=" + name + ", email=" + email + ", source="
				+ source + ", destination=" + destination + ", traveldate=" + traveldate + ", pickuptime=" + pickuptime
				+ ", arrivaltime=" + arrivaltime + ", fare=" + fare + "]";
	}

	
}
