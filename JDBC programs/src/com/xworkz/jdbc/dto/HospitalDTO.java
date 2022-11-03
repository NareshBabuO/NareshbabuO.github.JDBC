package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HospitalDTO {
	
	
	private int id;//>0 && <50000
	private String name;//not null and no special CHaracters, >5 , <50
	private String specialist;//not null and no special CHaracters, >3 , <50
	private String founder;//not null and no special CHaracters, >5 , <50
	private int since;// >1800, <2022

}
