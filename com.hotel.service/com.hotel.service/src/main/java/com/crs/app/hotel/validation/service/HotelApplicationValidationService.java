package com.crs.app.hotel.validation.service;

import org.springframework.stereotype.Service;

import com.crs.app.hotel.dto.HotelDTO;
import com.crs.hotel.exception.ValidationException;

@Service
public class HotelApplicationValidationService {
	

	
	public void validateHotelDTO(HotelDTO dto) {
		ValidationException validationError=null;
		if(dto!=null) {
			if(dto.getHotelName().isEmpty()||dto.getHotelName()==null) {
				
			}else if(dto.getRegion().isEmpty() ||dto.getRegion()==null) {
				
			}else if(dto.getTimings().isEmpty() ||dto.getTimings()==null) {
	            
			}else if(dto.getStatus().isEmpty() ||dto.getStatus()==null) {
                 
			}else if(dto.getRoomsInfo().isEmpty() ||dto.getRoomsInfo()==null) {
                
			}else if(dto.getAddress()==null) {
		        
			}else if(dto.getAddress().getState().isEmpty() || dto.getAddress().getState()==null) {
				
			}else if(dto.getAddress().getDistrict().isEmpty() || dto.getAddress().getDistrict()==null) {
				
			}else if(dto.getAddress().getCity().isEmpty() || dto.getAddress().getCity()==null) {
				
			}else if(dto.getAddress().getPinCode().isEmpty() || dto.getAddress().getPinCode()==null) {
				
			}else if(dto.getAddress().getAddressLine1().isEmpty() || dto.getAddress().getAddressLine1()==null) {
				
			}else if(dto.getRoomsInfo().isEmpty() || dto.getRoomsInfo()==null) {
				
			}
			
		}else {
			
			
		}
		
	}

}
