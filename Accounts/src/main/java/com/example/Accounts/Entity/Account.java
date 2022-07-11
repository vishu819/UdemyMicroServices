package com.example.Accounts.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity@Getter @Setter
public class Account {
	
	
	
	@Id
	String id;
	
	String name;


}
