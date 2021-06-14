package com.crs.app.hotel.enums;

public enum HotelStatus {
	
AVAILABLE("Available"),CLOSED("Closed");
	
	private final String value;
	
	HotelStatus(String value){
		this.value=value;
	}
	
	private String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
	
	public static HotelStatus getEnum(String value) {
		if(value==null || "".equals(value)) {
			return null;
		}
		for(HotelStatus status:values()) 
			if(status.toString().equalsIgnoreCase(value)) return status;
		throw new IllegalArgumentException();
		
	}

}
