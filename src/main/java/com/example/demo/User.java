package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//declaring class entity
@Entity

//declaring table
@Table(name="users")
public class User {
	  //declaring id
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  //declaring column
	  @Column(nullable =false,unique=true ,length=45)
	  private String email;
	  
	  //declaring column
	  @Column(nullable=false,length=64)
	  private String password;
	  
	  //declaring column
	  @Column(nullable=false,length=20)
	  private String firstName;
	  
	  //declaring column
	  @Column(nullable=false,length=64)
	  private String lastName;
	
	  //getter and setter for id
	  public Long getId() {
		return id;
	  }
	  public void setId(Long id) {
		this.id = id;
	  }
	  
	  //getter and setter for email
	  public String getEmail() {
		return email;
	  }
	  public void setEmail(String email) {
		this.email = email;
	  }
	
	  //getter and setter for first name
	  public String getFirstName() {
		return firstName;
	  }
	  public void setFirstName(String firstName) {
		this.firstName = firstName;
	  }
	
	  //getter and setter for last name
	  public String getLastName() {
		return lastName;
	  }
	  public void setLastName(String lastName) {
		this.lastName = lastName;
	  }
	
	  //getter and setter for password
	  public String getPassword() {
		return password;
	  }
	  public void setPassword(String password) {
		this.password = password;
	  }	
}