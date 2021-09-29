/* 2. The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. Every subsequent 
 * value is the sum of the 2 values preceding it. Write a Java 
 * Program that print the nth value of the Fibonacci sequence?  */

import java.util.Scanner;

public class Lab_03_Assignment_02 {
	
	// Fibinacco
		public static void main(String[] args) {

			int n,firstTerm = 0, secondTerm = 1;
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter any number: ");
			n = input.nextInt();
			for(int i=1;i<n;i++)
			{
				int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
				
			      System.out.println("Fibinacco series of"+nextTerm);
			}
			
		}
}
