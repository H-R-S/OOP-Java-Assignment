/*3.Write a Java program that prompts the user for an integer 
 * and then prints out all the prime numbers up to that Integer?  */

import java.util.Scanner;

public class Lab_03_Assignment_03 {
	
	// Prime
    public static void main(String[] args) {
		
		int n, i;
		Scanner input = new Scanner(System.in);
		System.out.println("Find prime numbers");
		System.out.println("Enter any number greater than 1: ");
		n = input.nextInt();

		if (n == 1) {
			System.out.println("1 is not a prime number neither there are prime Numbers less than 1");
		} else if (n == 2) {
			System.out.println(n + " is the smallest prime number");
		} else if (n > 2) {
			for (i = 3; i < n; ++i) {

				if (i % 2 != 0) {
					System.out.println("Prime numbers less than"+n+" are"+i);
				}			
			}
		}
	}
}
