package com.crs.app.hotel.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO implements Serializable{
	
	private String city;
	private String state;
	private String district;
	private String addressLine1;
	private String addressLine2;
	private String pinCode;



}
