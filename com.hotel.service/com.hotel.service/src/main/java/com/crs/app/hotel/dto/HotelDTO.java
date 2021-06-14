package com.crs.app.hotel.dto;

import java.io.Serializable;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -7598111445798564995L;
	
	private String hotelName;
	  private String region;
	  private String timings;
	  private AddressDTO address;
	  private String status;
	  private Set<RoomsDTO> roomsInfo;


}
