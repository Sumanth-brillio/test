package com.brillio.training.entity;

public class Customer {
	//fields will be initialised to 0 or null
	private int customerId;
	private String firstname;
	private String lastname;
	
	private Address address;  //Has-A relationship (aggregation)
	
	public Customer() {
		
	}

	public Customer(int customerId, String firstname, String lastname) {
		
		this.customerId = customerId;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void print(){
		System.out.println("Id      " + customerId);
		System.out.println("name    "+ firstname + " " + lastname);
		
		if(address!=null){
			address.print();
		}
	}
	
	
}
