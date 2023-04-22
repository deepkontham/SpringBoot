package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.FlightBookingAcknowlodgement;
import com.example.dto.FlightBookingRequest;
import com.example.service.FlightBookingService;

@RestController
public class Controllers {
	@Autowired
	private FlightBookingService bookingService;
	
	@PostMapping("/bookflight")
	public FlightBookingAcknowlodgement bookingAcknowlodgement(@RequestBody FlightBookingRequest request) {
		return bookingService.bookingAcknowlodgement(request);
		
	}


}
