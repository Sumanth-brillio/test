package com.brillio.training.exercises.programs;

public class NearestSquareRoot {
public static int CalculateNearestSquareRoot(double n)
{
	if(n<0)
	{
		return -1;
	}
	double c;
	int b;
	c=Math.sqrt(n);
	b=(int) Math.round(c);
	return b;
	
}
public static void main(String[] args) {
	double n = 1234;
	int a = CalculateNearestSquareRoot(n);
	System.out.println("output is" + a);
}
}
