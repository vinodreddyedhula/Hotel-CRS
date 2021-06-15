package com.crs.hotel.rest.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crs.app.hotel.dto.HotelDTO;
import com.crs.app.hotel.dto.HotelResponseDTO;
import com.crs.app.hotel.dto.SuccessResponse;
import com.crs.app.hotel.interfaces.IHotelApplicationService;
import com.crs.app.hotel.interfaces.IHotelControllerInterface;

@RestController
@RequestMapping(value="/api/v1/",produces="application/json")
public class HotelController implements IHotelControllerInterface{
	
	  @Autowired 
	  private IHotelApplicationService hotelAppService;
	 

	@PostMapping("hotels")
	public ResponseEntity<?> addHotel(
			  @Valid @RequestBody HotelDTO hotelDto) {
		HotelResponseDTO responseDTO=hotelAppService.addHotel(hotelDto);
		SuccessResponse<HotelResponseDTO> response=new SuccessResponse<HotelResponseDTO>(responseDTO);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("hotels/{hotel-id}")
	public ResponseEntity<?> getHotelDetails( @PathVariable(value="hotel-id",required=true) String hotelId) {	
		HotelResponseDTO responseDTO=hotelAppService.fetchHotelDtls(hotelId);
		SuccessResponse<HotelResponseDTO> response=new SuccessResponse<HotelResponseDTO>(responseDTO);
		return ResponseEntity.ok(response);

	}

	@Override
	@DeleteMapping("hotels/{hotel-id}")
	public ResponseEntity<?> deleteHotelDetails(@NotNull @PathVariable(value="hotel-id",required=true) String hotelId) {
		HotelResponseDTO responseDTO=hotelAppService.deleteHotelDetails(hotelId);
		SuccessResponse<HotelResponseDTO> response=new SuccessResponse<HotelResponseDTO>(responseDTO);
		return ResponseEntity.ok(response);
	}
	
	@Override
	@PutMapping("hotels/{hotel-id}")
	public ResponseEntity<?> updateHotel(@Valid @RequestBody HotelDTO hotelDTO,
			@NotNull @PathVariable(value="hotel-id",required=true) String hotelId) {
		HotelResponseDTO responseDTO=hotelAppService.updateHotel(hotelDTO,hotelId);
		SuccessResponse<HotelResponseDTO> response=new SuccessResponse<HotelResponseDTO>(responseDTO);
		return ResponseEntity.ok(response);
	}
	
	private class HotelAPIResponse extends SuccessResponse<HotelResponseDTO> {
        public HotelAPIResponse(HotelResponseDTO response) {
            super(response);
        }

       @Override
        public HotelResponseDTO getResponse() {
            return (HotelResponseDTO) super.getResponse();
        }
    }

}
