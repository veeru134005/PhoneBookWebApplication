package com.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

	Integer conatactid;
	String contactName;
	String contactEmailId;
	Integer conactNumber;
	
}
