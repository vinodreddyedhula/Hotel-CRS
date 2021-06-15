package com.crs.app.hotel.assembler;

import java.util.Date;
import java.util.HashSet;

import com.crs.app.hotel.dto.AddressDTO;
import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;
import com.crs.app.hotel.dto.RoomsDTO;
import com.crs.domain.hotel.entities.Address;
import com.crs.domain.hotel.entities.HotelDetails;
import com.crs.domain.hotel.entities.Rooms;


public class HotelAssembler {
	
	
	// This method is used to  convert dto to domain object.
	public HotelDetails toDomainObject(HotelDTO hotelDTO) {
		Address address=new Address();
		
		
		/*
		 * Address address1=new
		 * Address("",hotelDTO.getAddress().getCity(),hotelDTO.getAddress().getDistrict(
		 * ),
		 * hotelDTO.getAddress().getState(),hotelDTO.getAddress().getPinCode(),hotelDTO.
		 * getAddress().getAddressLine1(), hotelDTO.getAddress().getAddressLine2());
		 */
		 
		 
		address.setCity(hotelDTO.getAddress().getCity());
		address.setDistrict(hotelDTO.getAddress().getDistrict());
		address.setState(hotelDTO.getAddress().getState());
		address.setAddressLine1(hotelDTO. getAddress().getAddressLine1());
		address.setAddressLine2(hotelDTO. getAddress().getAddressLine2());
		address.setPinCode(hotelDTO.getAddress().getPinCode());
		
		HashSet<Rooms> roomsList=new HashSet<Rooms>();
		Rooms roomInfo=new Rooms();
		
		
		for(RoomsDTO room:hotelDTO.getRoomsInfo()) {
			roomInfo.setRoomNo(room.getRoomNo());
			roomInfo.setRoomPrice(room.getRoomPrice());
			roomInfo.setRoomType(room.getRoomType());
			roomsList.add(roomInfo);
		}
		
		HotelDetails hotel=new HotelDetails();
		hotel.setHotelName(hotelDTO.getHotelName());
		hotel.setRegion(hotelDTO.getRegion());
		hotel.setTimings(hotelDTO.getRegion());
		hotel.setAddress(address);
		hotel.setRoomsInfo(roomsList);
		hotel.setCreatedDate(new Date());
		hotel.setModifiedDate(new Date());
		/*
		 * HotelDetails hotel=new
		 * HotelDetails(hotelDTO.getHotelName(),hotelDTO.getRegion(),
		 * hotelDTO.getTimings(),address,roomInfo,HotelStatus.getEnum(hotelDTO.getStatus
		 * ()), new Date(),new Date());
		 */
		return hotel;
	}
	
	
	// This method is used to  convert  domain object to dto.
	public HotelResponseDTO fromDomainObject(HotelDetails hotelDetails) {
		
		AddressDTO address=new AddressDTO();
		address.setCity(hotelDetails.getAddress().getCity());
		address.setDistrict(hotelDetails.getAddress().getDistrict());
		address.setState(hotelDetails.getAddress().getState());
		address.setAddressLine1(hotelDetails. getAddress().getAddressLine1());
		address.setAddressLine2(hotelDetails. getAddress().getAddressLine2());
		address.setPinCode(hotelDetails.getAddress().getPinCode());
		
		HashSet<RoomsDTO> roomsList=new HashSet<RoomsDTO>();
		RoomsDTO roomInfo=new RoomsDTO();
			
		for(Rooms room:hotelDetails.getRoomsInfo()) {
			roomInfo.setRoomNo(room.getRoomNo());
			roomInfo.setRoomPrice(room.getRoomPrice());
			roomInfo.setRoomType(room.getRoomType());
			roomsList.add(roomInfo);
		}
		
		HotelResponseDTO hotel=new HotelResponseDTO();
		hotel.setHotelName(hotelDetails.getHotelName());
		hotel.setRegion(hotelDetails.getRegion());
		hotel.setTimings(hotelDetails.getRegion());
		hotel.setAddress(address);
		hotel.setRoomsInfo(roomsList);
		hotel.setCreatedDate(hotelDetails.getCreatedDate());
		return hotel;
		
	}

}
