package com.crs.app.hotel.interfaces;

import org.springframework.http.ResponseEntity;

import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface IHotelControllerInterface {
	
	 @ApiOperation(value="Add Hotel Details")
	 @ApiResponses(value= {
			 @ApiResponse(code=200,message="Successfully Created",response=HotelResponseDTO.class),
			 @ApiResponse(code=400,message="Invalid Request",response=HotelResponseDTO.class),
			 @ApiResponse(code=500,message="Internal validation error",response=HotelResponseDTO.class)
	 })
	public ResponseEntity<?> addHotel(HotelDTO hotelDTO);
	 
	 @ApiOperation(value="Update Hotel Details")
	 @ApiResponses(value= {
			 @ApiResponse(code=200,message="Successfully Updated",response=HotelResponseDTO.class),
			 @ApiResponse(code=400,message="Invalid Request",response=HotelResponseDTO.class),
			 @ApiResponse(code=500,message="Internal validation error",response=HotelResponseDTO.class)
	 })
	public ResponseEntity<?> updateHotel(HotelDTO hotelDTO);
	 
	 
	 @ApiOperation(value="Fetch Hotel Details")
	 @ApiResponses(value= {
			 @ApiResponse(code=200,message="Successfully Updated",response=HotelResponseDTO.class),
			 @ApiResponse(code=400,message="Invalid Request",response=HotelResponseDTO.class),
			 @ApiResponse(code=500,message="Internal validation error",response=HotelResponseDTO.class)
	 })
	public ResponseEntity<?> getHotelDetails(String hotelName,String Region);


}
