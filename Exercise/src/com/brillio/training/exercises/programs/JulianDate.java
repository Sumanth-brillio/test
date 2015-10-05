package com.brillio.training.exercises.programs;

public class JulianDate {

	public static int CalculateJulianDate(int day, int month, int year) {
		int jd = 0, max, i;
		max = maxDays(month, year);
		if (year <= 0) {
			return -1;
		}

		if (month < 1 || month > 12) {
			return -2;
		}

		if (day < 1 || day > max) {
			return -3;
		}

		for (i = 1900; i < year; i++) {
			if(isleap(i))
					{
				jd+= 366;
					}
			else {
				jd+= 365;
			}
		}

		for (i = 1; i <month; i++) {
			max=maxDays(i,year);
			jd+=max;
			}
		jd+=day;
		return jd;
		
	}		
		
		


	static boolean isleap(int y) {
		return ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);
		 
	}

	static int maxDays(int m1, int y1) {
		switch(m1){
		case 2: return isleap(y1)?29:28;
		case 4 : case 6: case 9: case 11: return 30;
		default: return 31;
		}
		
		
	}

	public static void main(String[] args) {
		int d = 13, m = 2, y = 2015, a;
		a = CalculateJulianDate(d, m, y);
		System.out.println("no of days is" + a);
	}
}
