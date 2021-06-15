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
	
	@Test
	public void updateHotelDetailsTest() {
		String hotelId="";
		HotelResponseDTO response=hotelService.updateHotel(prepareHotelDTO(),hotelId);
		assertEquals(hotelId,response.getKey());
	}
	
	@Test
	public void deleteHotelDetailsTest() {
		String hotelId="";
		HotelResponseDTO response=hotelService.deleteHotelDetails(hotelId);
		assertEquals("00",response.getStatusCode());
	}
	
	@Test
	public void fetchHotelDtlsTest() {
		String hotelId="";
		HotelResponseDTO response=hotelService.fetchHotelDtls(hotelId);
		assertEquals(hotelId,response.getKey());
	}

	private HotelDTO prepareHotelDTO() {
		HotelDTO dto=new HotelDTO();
		  dto.setHotelName("Radisson");
		  dto.setRegion("India");
          dto.setStatus("Available");
          dto.setTimings("Mon-Sun(24/7)");
          dto.setAddress(null);
		return dto;
		
	}

}
