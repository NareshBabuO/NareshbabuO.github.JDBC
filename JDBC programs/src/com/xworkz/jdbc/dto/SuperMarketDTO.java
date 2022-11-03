package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@NoArgsConstructor
@Setter
public class SuperMarketDTO {
	
	private int id;
	private String name;
	private String company;
	private long gstNo;
	private String type;

}
