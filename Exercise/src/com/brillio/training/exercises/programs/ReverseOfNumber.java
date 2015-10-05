package com.brillio.training.exercises.programs;

public class ReverseOfNumber {
	public static int reverse(int n){
		int r,rev=0;
			while(n!=0)
			{
				r=n%10;
				n=n/10;
//				if(r==0)
//				{
//				
//				}
				rev=(rev*10)+r;
			}
			return rev;
	}
	public static void main(String[] args) {
		int n=-123000,j;
		j=reverse(n);
		System.out.println("reversed no is" + j);
	}
}
