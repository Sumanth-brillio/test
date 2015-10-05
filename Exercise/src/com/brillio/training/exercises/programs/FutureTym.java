package com.brillio.training.exercises.programs;

public class FutureTym {
	
	public static void display(int h, int m,int s,int d){
		
		int e;
		if (h>24 && m>60 && s>60)
		{
			System.out.println("invalid");
		}
		if(d<0)
		{
			e=s-d;
				if(e>60)
				{
					s=e%60;
					m=m+(e/60);
							if(m>60)
							{
								m=m%60;
								h=h+(m/60);
							}
				}
			
		}
		else
		{
			e=s+d;
		if(e>60)
		{
			s=e%60;
			m=m+(e/60);
					if(m>60)
					{
						m=m%60;
						h=h+(m/60);
					}
		}
	
}
		System.out.println(+h +":"+ m +":"+s);
	}
	public static void main(String[] args) {
		int h=11;
		int m=9;
		int s=23;
		int d=120;
		display(h,m,s,d);
		
		
	}

}
