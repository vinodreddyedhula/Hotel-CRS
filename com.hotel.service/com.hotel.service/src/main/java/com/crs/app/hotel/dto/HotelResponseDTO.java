package com.crs.app.hotel.dto;

import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelResponseDTO extends BaseResponse {

	private String hotelName;
	private String region;
	private String timings;
	private AddressDTO address;
	private String status;
	private Set<RoomsDTO> roomsInfo;
	private Date createdDate;

}
