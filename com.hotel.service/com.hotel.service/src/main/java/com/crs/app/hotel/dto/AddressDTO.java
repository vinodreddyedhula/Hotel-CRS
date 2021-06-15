package com.crs.app.hotel.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO implements Serializable{
	
	@NotEmpty(message="")	
	private String city;
	
	@NotEmpty(message="")	
	private String state;
	
	@NotEmpty(message="")	
	private String district;
	
	@NotEmpty(message="")	
	private String addressLine1;
	private String addressLine2;
	
	@NotEmpty(message="")	
	private String pinCode;



}
