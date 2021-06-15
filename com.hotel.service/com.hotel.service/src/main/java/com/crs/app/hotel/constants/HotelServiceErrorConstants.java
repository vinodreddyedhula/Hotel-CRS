package com.crs.app.hotel.constants;

import org.springframework.beans.factory.annotation.Value;

public class HotelServiceErrorConstants {
	
	//Hotel Error Constants
	
	@Value("${hotel.name.null}")
	private String HOTEL_NAME_NULL ;
	
	@Value("${hotel.status.null}")
	private String HOTEL_STATUS_NULL;
	
	@Value("${hotel.timings.null}")
	private String HOTEL_TIMINGS_NULL;
	
	@Value("${hotel.region.null}")
	private String HOTEL_REGION_NULL ;
	
	@Value("${hotel.address.null}")
	private String HOTEL_ADDRESS_NULL;
	
	@Value("${hotel.rooms.null}")
	private String HOTEL_ROOMS_NULL;
	
	//Address Error Constants
	@Value("${hotel.name.null}")
	private String CITY_NUll ;
	
	@Value("${hotel.status.null}")
	private String DISTRICT_NULL;
	
	@Value("${hotel.timings.null}")
	private String CITY_NULL;
	
	@Value("${hotel.region.null}")
	private String PINCODE_NULL ;
	
	@Value("${hotel.address.null}")
	private String ADDRESS_LINE1_NULL;
	

	//Room Information Error Constants
	@Value("${room.number.null}")
	private String ROOM_NO_NULL ;
	
	@Value("${room.price.null}")
	private String ROOM_PRICE_NULL;
	
	@Value("${room.type.null}")
	private String ROOM_TYPE_NULL;
}
