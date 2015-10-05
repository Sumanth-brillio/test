package com.brillio.training.programs;

import com.brillio.training.entity.Category;
import com.brillio.training.entity.product;

public class Program02 {
public static void main(String[] args) {
	Category c1=new Category(10,"Beverages","Drinkables like tea,coffee etc..");
	
	product p1 = new product(12,"chai",18.5);
	p1.setCategory(c1);
	
	System.out.println(p1);
	System.out.println(p1.getCategory());
}
}
