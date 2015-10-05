package com.brillio.training.exercises.programs;

public class DayInMonthAndYear {

	public static int display(int mnth, int yr)
	{
		int days=0;
		if(yr<0)
		{
			return -2;
		}
		if(mnth>12 || mnth<=0)
		{
			return -1;
		}
		else if(mnth==2)
		{
			if(yr%400==0)
			{
				days=29;
			}
			else
			{
				days=28;
			}
		}
		else if(mnth==1 || mnth==3 || mnth==5 || mnth==7 || mnth==8 || mnth==10 ||mnth==12)
		{
			days=31;
			
		}
		else if (mnth ==4 || mnth==6|| mnth==9 || mnth==1)
	{
			days=30;
			
			}
	return days;
	}

public static void main(String[] args) {
	int mnth,yr,a;
	mnth=2;
	yr=2013;
	a=display(mnth,yr);
	System.out.println("no of days"+ a);
}

}
