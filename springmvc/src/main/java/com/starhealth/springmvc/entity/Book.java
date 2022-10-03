package com.starhealth.springmvc.entity;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book {

	private int bid;
	private String bname;
	private double bprice;
	private  String btype;
	private  Date doi;
	
	
}
