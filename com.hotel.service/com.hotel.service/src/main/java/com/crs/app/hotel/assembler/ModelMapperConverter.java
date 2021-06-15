package com.crs.app.hotel.assembler;

import org.modelmapper.ModelMapper;

import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;
import com.crs.domain.hotel.entities.HotelDetails;

public class ModelMapperConverter {
	
	 private ModelMapper modelMapper;

	    public ModelMapperConverter() {
	        modelMapper = new ModelMapper();
	    }

	   
	    public HotelDetails toDomainObject(HotelDTO hotelDTO) {
	       return modelMapper.map(hotelDTO, HotelDetails.class);
	    }

	   
	    public HotelResponseDTO fromDomainObject(HotelDetails hotelDetails) {
	        return modelMapper.map(hotelDetails, HotelResponseDTO.class);
	    }

}
