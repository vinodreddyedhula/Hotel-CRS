package com.crs.domain.hotel.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.crs.app.hotel.enums.RoomType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="EPM_ROOMS")
public class Rooms {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(name="ID")
	private String key;
	
	@Column(name="HOTEL_ID")
	private String HotelId;
	
	@Column(name="ROOM_TYPE")
	private RoomType roomType;
	
	@Column(name="ROOM_NO")
	private String roomNo;
	
	@Column(name="ROOM_PRICE")
	private BigDecimal roomPrice;

}
