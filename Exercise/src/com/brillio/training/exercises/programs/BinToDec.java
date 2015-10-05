package com.brillio.training.exercises.programs;

public class BinToDec {
	public static int btd(int n) 
	{
		int i, y = 0, r, d = 0,b=n;
		while (b != 0)
		{
			b = b / 10;
			y++;
			System.out.println("y is" + y );
		
		}
		for (i = 0; i < y; i++)
		{
			r = n % 10;
			n = n / 10;
			if (r==0 || r==1) 
			{
				d += (r * (Math.pow(2, i)));
			}
		}
	return d;
	}

	public static void main(String[] args) 
	{
		int n = 100000,a;
			a=btd(n);
			System.out.println(a);
	}
}
