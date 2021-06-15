package com.crs.hotel.controller.testing;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.crs.hotel.rest.controller.HotelController;

@RunWith(MockitoJUnitRunner.class)
public class HotelControllerTest {
	
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private HotelController hotelController;
	
	@Before
	public void setup() {
		
		mockMvc=MockMvcBuilders.standaloneSetup(hotelController).build();
	}
   
	@Test
	public void addHotelTest() throws Exception {
		String reqJson="{\r\n"
				+ "  \"address\": {\r\n"
				+ "    \"addressLine1\": \"string\",\r\n"
				+ "    \"addressLine2\": \"string\",\r\n"
				+ "    \"city\": \"string\",\r\n"
				+ "    \"district\": \"string\",\r\n"
				+ "    \"pinCode\": \"string\",\r\n"
				+ "    \"state\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"hotelName\": \"string\",\r\n"
				+ "  \"region\": \"string\",\r\n"
				+ "  \"roomsInfo\": [\r\n"
				+ "    {\r\n"
				+ "      \"roomNo\": \"string\",\r\n"
				+ "      \"roomPrice\": 0,\r\n"
				+ "      \"roomType\": \"LUXURY\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"string\",\r\n"
				+ "  \"timings\": \"string\"\r\n"
				+ "}";
		
		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/hotel/")
				.contentType(MediaType.APPLICATION_JSON).content(reqJson)).andExpect(status().is(200));
		
	}


}
