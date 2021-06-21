package com.dungeon.beans;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@Table("user")
public class User {
	
	@PrimaryKey
	@Column
	private Integer id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String twitchName;
	@Column
	private String password;
	
	
	public User() {
		super();
		this.setId(1);
		this.setFirstName("Default");
		this.setLastName("Default");
		this.setTwitchName("Default");
		this.setPassword("Default");
	}
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		if (id > 0) {
			this.id = id;
		}
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTwitchName() {
		return twitchName;
	}


	public void setTwitchName(String twitchName) {
		this.twitchName = twitchName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
