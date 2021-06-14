package com.crs.app.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.crs.app.hotel.assembler.HotelAssembler;
import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;
import com.crs.app.hotel.interfaces.IHotelApplicationService;
import com.crs.domain.hotel.entities.HotelDetails;
import com.crs.domain.hotel.service.HotelDomainService;

import lombok.extern.slf4j.Slf4j;

@Service("hotelApplicationService")
@Slf4j
public class HotelApplicationService implements IHotelApplicationService{

	@Autowired
	@Qualifier("hotelDomainService")
	private HotelDomainService hotelDomainService;
	
	@Override
	public HotelResponseDTO addHotel(HotelDTO hotelDTO) {
		log.info("Add Hotel Details");
		HotelAssembler hotelAssembler=new HotelAssembler();
		HotelDetails hotelDetails=hotelAssembler.toDomainObject(hotelDTO);
		hotelDomainService.addHotelDetails(hotelDetails);
		HotelResponseDTO responseDTO=hotelAssembler.fromDomainObject(hotelDetails);
		return responseDTO;
	}

	@Override
	public HotelResponseDTO updateHotel(HotelDTO hotelDTO) {
		// TODO Auto-generated method stub
		log.info("Update Hotel Details");
		return null;
	}

	@Override
	public HotelResponseDTO fetchHotelDtls(HotelDTO hotelDTO) {
		// TODO Auto-generated method stub
		log.info("Fetch Hotel Details");
		return null;
	}

	@Override
	public HotelResponseDTO deleteHotel(HotelDTO hotelDTO) {
		// TODO Auto-generated method stub
		log.info("Delete Hotel Details");
		return null;
	}

}
