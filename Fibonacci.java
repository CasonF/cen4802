package main;

import java.util.Scanner;

public class Fibonacci {
	/**
	* Solves for nth term of Fibonacci sequence based on user input.
	* @author Cason Fluharty
	* @version 1.0
	*/
	public static void main(String[] args)
	{
		String ly; // Used for proper suffix when displaying nth term system message
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the nth term of the Fibonacci\nsequence you would like returned:");
		int q = s.nextInt(); // Gets qth (nth) term through scanner
		
		// Series of if-elif to determine correct suffix for String ly
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
		
		// Prints suggested output with proper term, suffix, and result
		System.out.print("The " + q + ly + " term of the Fibonacci sequence is " + fibonacci(q));
	}
	
	
	/**
	* Returns the nth term in the Fibonacci sequence, displayed to console.
	* <p>
	* This method takes longer to return the larger the nth term is
	* that is tested. Running this method using n <= 20 yields
	* fast results, but anything larger may give delays.
	* 
	* @param   n  the tested term in the Fibonacci sequence
	* @return     the solved nth term of the Fibonacci sequence
	*/
	public static int fibonacci(int n)
	{
		if (n <= 1) { return n; }
		int result = fibonacci(n - 1) + fibonacci(n - 2);
		return result;
	}
}
