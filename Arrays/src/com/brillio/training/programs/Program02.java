package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {
public static void main(String[] args) {
	//ar is reference to array object;
	int [][]ar;
	// can also initialise as
	 int [][] nums={
	{10,20},
	{33,4,33},
	{393,232,234,345,678}};
	 for (int i = 0; i < nums.length; i++) {
		System.out.println(Arrays.toString(nums[i]));
	}
	
	ar=new int[3][];
	
}
}
