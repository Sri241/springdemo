package com.wipro.training.springdemo;

public class Address {

	
	private String city,state,country;
    Long pincode;
    
    
	public Address(String city, String state, String country, Long pincode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
    
   
	
	
	
}
