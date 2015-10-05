package com.brillio.training.exercises.programs;

public class SumOfPrimes {

	public static int display(int a, int b)
	{
		int j,k,x=0;
		if(a>b)
		{
			int temp;
			temp=a;
			a=b;
			b=temp;
		}
		if(a<=0)
		{
			a=2;
		}
		here:
		for(j=a;j<=b;j++)
		{
			for(k=2;k<=j/2;k++)
			{
				if((j%k)==0)
				{
					//System.out.println(j);
					continue here;
				}
				
			}
			x=x+j;
		}
		//System.out.println(x);
		return x;
	}
	public static void main(String[] args) {
		int a=-100;
		int b=50,i;
		i=display(a,b);
		System.out.println("sum of prime nos is " + i);
	}
}
