package com.digital.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@javax.persistence.Id
	private Long Id;
	private String userName;
	private String password;
	
	
	
}
