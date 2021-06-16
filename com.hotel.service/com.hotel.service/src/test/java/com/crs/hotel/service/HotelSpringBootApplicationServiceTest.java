package com.crs.hotel.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.crs.app.hotel.dto.AddressDTO;
import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;
import com.crs.app.hotel.dto.RoomsDTO;
import com.crs.app.hotel.enums.RoomType;
import com.crs.hotel.service.HotelSpringBootApplicationService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HotelSpringBootApplicationService.class,
                 webEnvironment = WebEnvironment.RANDOM_PORT)
class HotelSpringBootApplicationServiceTest {
	
	 @LocalServerPort
	 private int port;
	
	 @Autowired
	 private TestRestTemplate restTemplate;

	@Test
	void addHotelTest() {
		HotelDTO hotelDTO=prepareHotelDTO();
		ResponseEntity<HotelResponseDTO> response=restTemplate.postForEntity("http://localhost:" + port + "/api/v1/hotels",hotelDTO, HotelResponseDTO.class);
		assertEquals(response.getStatusCode(), Status.OK);
	}

	
	private HotelDTO prepareHotelDTO() {
		HotelDTO dto=new HotelDTO();
		  dto.setHotelName("Radisson");
		  dto.setRegion("India");
          dto.setStatus("Available");
          dto.setTimings("Mon-Sun(24/7)");
          AddressDTO address =new AddressDTO();
          address.setDistrict("RNG");
          address.setCity("Hyd");
          address.setPinCode("500032");
          address.setAddressLine1("Anjaiah Nagar,Gachibowli");
          address.setState("TS");
          dto.setAddress(address);
          Set<RoomsDTO> rooms=new HashSet<RoomsDTO>();
          RoomsDTO room1=new RoomsDTO();
          room1.setRoomNo("R101");
          room1.setRoomPrice(BigDecimal.ONE);
          room1.setRoomType(RoomType.NORMAL);
          rooms.add(room1);
          dto.setRoomsInfo(rooms);
		return dto;
	}
}
