package com.crs.domain.hotel.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.crs.app.hotel.enums.HotelStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity(name="EPM_HOTEL")
public class HotelDetails implements Serializable{
	

	private static final long serialVersionUID = 1828762333770258928L;

	  @Id
	  @Column(name="ID")
	  @GeneratedValue(generator="system-uuid")
	  @GenericGenerator(name="system-uuid",strategy="uuid")
	  private String key;
	  
	  @Column(name="NAME")
	  private String hotelName;
	  
	  @Column(name="REGION")
	  private String region;
	  
	  @Column(name="TIMINGS")
	  private String timings;
	  

	  @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	  @JoinColumn(name="ID")
	  private Address address;
	  

	  @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	  @JoinColumn(name="HOTEL_ID")
	  private Set<Rooms> roomsInfo;
	  
	  @Column(name="HOTEL_STATUS")
	  private HotelStatus status;
	  
	  @Column(name="CREATED_DATE")
	  private Date createdDate;

	  @Column(name="MODIFIED_DATE")
	  private Date modifiedDate;

}
