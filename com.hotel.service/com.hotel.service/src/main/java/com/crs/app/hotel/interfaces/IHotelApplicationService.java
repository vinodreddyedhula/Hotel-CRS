package com.crs.app.hotel.interfaces;

import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;

public interface IHotelApplicationService {
	
	public HotelResponseDTO addHotel(HotelDTO hotelDTO);
	public HotelResponseDTO updateHotel(HotelDTO hotelDTO);
	public HotelResponseDTO fetchHotelDtls(HotelDTO hotelDTO);
    public HotelResponseDTO deleteHotel(HotelDTO hotelDTO);

}
