package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {
	
	public static void increment(int[] ar, int by){
			for (int i = 0; i < ar.length; i++) {
				ar[i] += by;
			}
	}
	
	
	public static void main(String[] args) {

		// n is a reference to any array object
		int[] n ={12,449,5965};
		//can also intialise as 
		// int[] n; and n=new int[3];
		//n = {12,233,345}; it is an error and v cannot do as this.
		
		n=new int[] { 48,586,384};
		n[2]=12;
		n[0]=22;
		n[1]=393;
		
		int index=2;
		System.out.println(n[index]);
		
		System.out.println(Arrays.toString(n));
		increment(n,10);
		System.out.println(Arrays.toString(n));
		//n[3]=39339; // throws ArrayIndexOutOfBoundsException()
		//n[-1]=222;  // throws ArrayIndexOutOfBoundsException()
	}
}
