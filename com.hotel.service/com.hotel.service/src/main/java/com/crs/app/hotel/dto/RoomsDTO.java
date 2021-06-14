package com.crs.app.hotel.dto;

import java.math.BigDecimal;

import com.crs.app.hotel.enums.RoomType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomsDTO {
	
	  private String roomNo;
	  private RoomType roomType;
	  private BigDecimal roomPrice;


}
