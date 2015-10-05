package com.brillio.training.exercises.programs;

public class SumOfTwoNumbers {

	public static void sum(int a, int b, int c){

		int temp;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
			if (b > c) {
				temp = b;
				b = c;
				c = temp;
				if (a > b) {
					temp = a;
					a = b;
					b = temp;
				}
			}
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(a + ", " + b + ", " + c);

	}

	public static void main(String[] args) {

		int a, b, c;
		a = 500;
		b = 400;
		c = 300;

		sum(a, b, c);

	}

}