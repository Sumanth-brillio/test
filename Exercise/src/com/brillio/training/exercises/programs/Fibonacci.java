package com.brillio.training.exercises.programs;

public class Fibonacci {
	
	public static int CalculateFibbonacci(int n)
	{
		if(n<=0)
		{
			return -1;
		}
		else if (n>=100)
		{
			return -2;
		}
		 int p=0;
		 int q=1;
		 int temp=0,i;
		 for(i=0;i<n-2;i++)
		{
		 temp=q;
		 q=p+q;
		 p=temp;
		}
		return q;
	}
	
	public static void main(String[] args) {
		int n=10,a;
		a=CalculateFibbonacci(n);
		System.out.println("sum of fibb" + a);
	}

}
