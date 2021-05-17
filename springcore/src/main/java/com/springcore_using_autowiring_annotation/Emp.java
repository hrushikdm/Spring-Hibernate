package com.springcore_using_autowiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;
	@Autowired
	public Emp(Address address) {
		super();
		
		this.address = address;
		System.out.println("Using constructor");
	}

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.println("using setting value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
