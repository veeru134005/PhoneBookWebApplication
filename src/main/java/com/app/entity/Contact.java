package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "Contactlist")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer contactId;
	String contactName;
	String contactEmailId;
	Integer conactNumber;
	
}
