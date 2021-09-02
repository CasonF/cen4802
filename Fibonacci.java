package main;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		String ly;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the nth term of the Fibonacci\nsequence you would like returned:");
		int q = s.nextInt();
		
		if ((q % 10 == 3) && (q <= 10 || q >= 20))
		{
			ly = "rd";
		}
		else if ((q % 10 == 2) && (q <= 10 || q >= 20))
		{
			ly = "nd";
		}
		else if ((q % 10 == 1) && (q <= 10 || q >= 20))
		{
			ly = "st";
		}
		else
		{
			ly = "th";
		}
		
		System.out.print("The " + q + ly + " term of the Fibonacci sequence is " + fibonacci(q));
	}
	
	
	public static int fibonacci(int n)
	{
		if (n <= 1) { return n; }
		int result = fibonacci(n - 1) + fibonacci(n - 2);
		return result;
	}
}
