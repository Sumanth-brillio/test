package com.brillio.training.programs;

import com.brillio.training.entity.person;

public class CreatingObjects {
	
	public static void main(String[] args) {
		person p1; //a reference variable
		
		
		p1 = new person();
		
		System.out.println("Name is" +p1.name);
		System.out.println("age is"+p1.age);
	}

}
