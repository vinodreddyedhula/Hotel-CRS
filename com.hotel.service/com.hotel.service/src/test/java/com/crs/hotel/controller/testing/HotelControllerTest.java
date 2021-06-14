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
		String reqJson="{\"hotelName\":\"Radisson\"}";
		
		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/hotel/")
				.contentType(MediaType.APPLICATION_JSON).content(reqJson)).andExpect(status().is(200));
		
	}


}
