package com.crs.domain.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.crs.domain.hotel.entities.HotelDetails;
import com.crs.domain.hotel.repository.IHotelRepository;

@Service("hotelDomainService")
public class HotelDomainService {
	
	@Autowired
	@Qualifier("hotelrepository")
	private IHotelRepository repository;
	
	public void addHotelDetails(HotelDetails hotelDetails) {
		repository.save(hotelDetails);
	}
	
	public void updateHotelDetails(HotelDetails hotelDetails) {
		repository.save(hotelDetails);
	}
	
	public void fetchHotelDetails() {
		
	}

}
