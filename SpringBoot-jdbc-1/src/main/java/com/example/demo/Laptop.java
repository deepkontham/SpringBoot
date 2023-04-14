package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
	private String brand;
	private String Rom;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRom() {
		return Rom;
	}
	public void setRom(String rom) {
		Rom = rom;
	}
	public void laps() {
		System.out.println("this is laptop");
	}
	

}
