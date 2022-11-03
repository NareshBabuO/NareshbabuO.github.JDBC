package com.xworkz.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GardanDTO {
	
	private String name;//not null,no special charector,>5,<50
	private String area;//not null,no special charector,>5,<50
	private int totalTree; //  >5 , <500
	private int totalBeanch;//>5,<100

}
