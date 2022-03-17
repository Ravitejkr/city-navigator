package com.example.demo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	
	//variable
	private User user;
	
	//constructor
	public CustomUserDetails(User user) {
		super();
		this.user = user;
	}

	//authorization
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	//password
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	//username
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getEmail();
	}

	//checking if account is in active state
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	//checking whether account is locked or not
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	//ensuring credentials are active
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	//checking if account is enabled
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}