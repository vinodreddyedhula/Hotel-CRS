package com.crs.hotel.rest.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;
import com.crs.app.hotel.interfaces.IHotelApplicationService;
import com.crs.app.hotel.interfaces.IHotelControllerInterface;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="/api/v1/",produces="application/json")
public class HotelController implements IHotelControllerInterface{
	
	  @Autowired 
	  private IHotelApplicationService hotelAppService;
	 

	@PostMapping("hotel")
	public ResponseEntity<?> addHotel(
			 @NotNull @Valid @RequestBody HotelDTO hotelDto) {
		HotelResponseDTO responseDTO=hotelAppService.addHotel(hotelDto);
		return ResponseEntity.ok(responseDTO);
	}
	
	@GetMapping("hotel/{hotelName}/{city}")
	public ResponseEntity<?> getHotelDetails(@NotNull @PathVariable String hotelName,
			@NotNull @PathVariable String city) {										
		return null;
	}

	@Override
	public ResponseEntity<?> updateHotel(HotelDTO hotelDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
