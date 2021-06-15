package com.crs.domain.hotel.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.crs.domain.hotel.entities.HotelDetails;
import com.crs.domain.hotel.repository.IHotelRepository;
import com.crs.hotel.exception.BusinessException;

@Service("hotelDomainService")
public class HotelDomainService {
	
	@Autowired
	@Qualifier("hotelrepository")
	private IHotelRepository repository;
	
	public void addHotelDetails(HotelDetails hotelDetails) {
		hotelDetails.setCreatedDate(new Date());
		hotelDetails.setModifiedDate(new Date());
		repository.save(hotelDetails);
	}
	
	public void updateHotelDetails(HotelDetails hotelDetails) {
		hotelDetails.setModifiedDate(new Date());
		repository.save(hotelDetails);
	}
	
	public HotelDetails fetchHotelDetails(String hotelId) {
		Optional<HotelDetails> hotelDetails=repository.findById(hotelId);
		validateHotelDtls(hotelDetails);
		return hotelDetails.get();
	}

	public void deleteHotelDetails(String hotelId) {
		Optional<HotelDetails> hotelDetails=repository.findById(hotelId);
		validateHotelDtls(hotelDetails);
		hotelDetails.get().setModifiedDate(new Date());
		repository.delete(hotelDetails.get());
	}
	
	public void validateHotelDtls(Optional<HotelDetails> hotelDetails) {
		if(!hotelDetails.isPresent()) {
			throw new BusinessException("HOTEL_DTLS_NOT_FOUND","Hotel Details not found in system ");
		}
	}
}
