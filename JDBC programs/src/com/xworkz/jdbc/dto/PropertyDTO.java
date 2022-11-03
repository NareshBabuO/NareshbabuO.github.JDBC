package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyDTO {
	
	private int siteNo;//>0 <25000
	private String owner;//!=null && lenght.>5 && lenght.<40
	private String area;//!=null && lenght.>5 && lenght.<40
	private double cost;//>150000 && <1000000

}
