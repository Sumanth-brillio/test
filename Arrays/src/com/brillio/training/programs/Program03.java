package com.brillio.training.programs;

import java.util.Arrays;

public class Program03 {
	public static void main(String[] args) {
		String []names={"scott","miller","allen","Jones"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
			//enhanced for loop (for each loop)
			// introduced in java 1.5
			for(String name : names){
				System.out.println(name);
			}
			System.out.println("Nama at index 1 is "  +  names[1]);
		
	}

}
