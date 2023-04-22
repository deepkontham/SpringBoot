package com.example.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PassRepository;
import com.example.dao.PaymentRepository;
import com.example.dto.FlightBookingAcknowlodgement;
import com.example.dto.FlightBookingRequest;
import com.example.entity.PassengerInfo;
import com.example.entity.Paymentinfo;
import com.example.utils.PaymentJtils;

@Service
@Transactional
public class FlightBookingService {

	@Autowired
	private PassRepository passRepository;
	@Autowired
	private PaymentRepository paymentRepository;

	public FlightBookingAcknowlodgement bookingAcknowlodgement(FlightBookingRequest request) {
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passRepository.save(passengerInfo);
		
		Paymentinfo paymentInfo=request.getPaymentinfo();
		PaymentJtils.validatecreaditlimit(paymentInfo.getAccno(),passengerInfo.getFare());
		
		paymentInfo.setPassengerid(passengerInfo.getPassengerid());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentRepository.save(paymentInfo);
		
		
		return new FlightBookingAcknowlodgement("success",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);

	}

}
