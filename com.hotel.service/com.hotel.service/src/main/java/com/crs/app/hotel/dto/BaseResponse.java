package com.crs.app.hotel.dto;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseResponse implements Serializable{
	
	private String message;
	private String statusCode;
	

}
