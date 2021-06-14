package com.crs.hotel.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;
import com.crs.app.hotel.interfaces.IHotelApplicationService;

@RunWith(SpringJUnit4ClassRunner.class)
public class HotelApplicationServiceTest {
	
	@Autowired
	private IHotelApplicationService hotelService;
	
	@Test
	public void addHotelDetailsTest() {
		
		HotelResponseDTO response=hotelService.addHotel(prepareHotelDTO());
		assertEquals("00",response.getStatusCode());
	}

	private HotelDTO prepareHotelDTO() {
		HotelDTO dto=new HotelDTO();
		  dto.setHotelName("Radisson");
		  dto.setRegion("India");
          dto.setStatus("Available");
		return dto;
		
	}

}
