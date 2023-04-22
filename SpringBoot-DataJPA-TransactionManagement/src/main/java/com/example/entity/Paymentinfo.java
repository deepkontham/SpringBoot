package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Payment_tbl")
public class Paymentinfo {
	@Id                                                                          

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentid;                                                    
	                                                                             
	private String accno;                                                        
	private double amount;                                                       
	private String cardtype;                                                     
	private Long passengerid;
	public Paymentinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paymentinfo(Integer paymentid, String accno, double amount, String cardtype, Long passengerid) {
		super();
		this.paymentid = paymentid;
		this.accno = accno;
		this.amount = amount;
		this.cardtype = cardtype;
		this.passengerid = passengerid;
	}
	public Integer getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Integer paymentid) {
		this.paymentid = paymentid;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public Long getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(Long passengerid) {
		this.passengerid = passengerid;
	}
	@Override
	public String toString() {
		return "Paymentinfo [paymentid=" + paymentid + ", accno=" + accno + ", amount=" + amount + ", cardtype="
				+ cardtype + ", passengerid=" + passengerid + "]";
	}
	
	

}
