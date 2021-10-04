
# OOP-Java Assignments
___
## Lab: 01
Q.1 Write a simple java program with command-line argument in java.
### Code:

```
// Write a simple java program with command-line argument in java.

public class Lab_01_Task {
	
	public static void main(String[] args) {
		
		System.out.println("Lab Manual by H-R-S");
	}
}

```
### Output :
``` Lab Manual by H-R-S ```
___
## Lab: 02
Q.1 Program the following.
Implement the following equation

```3x^4 sin(180x) + 4x^3 cos(90x) + x^2 sin(tan(45)) + 7x + 9cos(90x^2)```

Where x may be user defined value.

### Code:

```
/* Implement the following equation
 
    3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 )

 where x may be user defined value. */

import java.util.Scanner; 

public class Lab_02_Assignment {
	
	public static void main(String[] args)
	{ 	
		//	   3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 )
		int x;
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter value of x : ");
		x = input.nextInt();
	
		double eq=3*Math.pow(x, 4)+4*Math.pow(x, 3)*Math.cosh(90*x)+Math.pow(x, 2)*Math.sin(Math.tan(45))+7*x+9*Math.cos(90*Math.pow(x, 2));
	
		System.out.println("3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 ) = " + eq);
	}
	
}


```
### Output :
```
Enter value of x : 
1
3x4sin(180x) + 4x3cos(90x) + x2sin(tan(45)) + 7x + 9cos(90x2 ) = 2.4408065886356817E39 
```
___

## Lab: 03
Q.1 Write a program 1 of this lab using switch statement.
### Code:
```
// Write a program 1 of this lab using switch statement.

import java.util.Scanner;

public class Lab_03_Assignment_01 {
	
	// Switch Case
		public static void main(String args[])
		{
			int num;
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter Number from 1-10: ");
			num = input.nextInt();
			String numbers;
			switch(num)
			{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");
				break;
			default:
				System.out.println("Invalid Month");
				break;
			}
		}
}
```
### Code Output:
```
Enter Number from 1-10: 
3
Three
```

Q.2 The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java Program that print the nth value of the Fibonacci sequence? 
### Code:
```
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
```

### Code Output:
```
Enter any number: 
10
Fibinacco series of1
Fibinacco series of2
Fibinacco series of3
Fibinacco series of5
Fibinacco series of8
Fibinacco series of13
Fibinacco series of21
Fibinacco series of34
Fibinacco series of55
```

Q.3 Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?  
### Code:
```
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
```
### Code Output:
```
Find prime numbers
Enter any number greater than 1: 
2
2 is the smallest prime number
```
___

## Lab: 04
Q.1 Create a class Calculator with following details;
•	The class should contain default and parameterized constructor. The constructors should just print the statement as follows.
o	“Inside Default Constructor”
o	“Inside Parameterized Constructor”.
•	The class should contain following data fields and methods;
int square = 2 ; 
int cube = 3;
o	calculateSquare(int x)
o	calculateCube(int x)
o	calculateFactorial (int x)
o	generateTable(int x)
•	Create objects of this class using both Constructors in main Class.
•	Call all three functions via object.
### Code:
#### Main.java:
```
package Calculator;

public class Main {
	
public static void main (String arg[]) {
		
		// Calling Trigonometric Functions
		trignometric_function t_f = new trignometric_function();
		
		// Calling Math Operators
		math_operators m_o = new math_operators();
		
		// Calling Arithmetic Function
		arthimatic_function a_f = new arthimatic_function();
		
		// Print Trigonometric Functions
		System.out.println("Sin(2) : " + t_f.sin(2));     // SinQ
		System.out.println("Cos(2) : " + t_f.cos(2));     // CosQ
		System.out.println("Tan(2) : " + t_f.tan(2));     // TanQ
		System.out.println("Cot(2) : " + t_f.cot(2));     // CotQ
		System.out.println("Sec(2) : " + t_f.sec(2));     // SecQ
		System.out.println("Cosec(2) : " + t_f.cosec(2)); // CosecQ
		
		// Print Math Operators
		System.out.println("2x10^2 : " + m_o.exp(2));     // Exponent
		System.out.println("2! : " + m_o.fac(2));         // Factorial
		System.out.println("2^2 : " + m_o.pow(2, 2));     // Power
		System.out.println("sqrt(4) : " + m_o.sqrtt(4));  // Square Root
		
		// Print Arithmetic Functions
		System.out.println("2+2 : " + a_f.sum(2, 2));     // Addition
		System.out.println("2-4 : " + a_f.sub(2, 4));     // Subtraction
		System.out.println("2*2 : " + a_f.mul(2, 2));     // Multiplication
		System.out.println("4/2 : " + a_f.div(4, 2));     // Division
		System.out.println("2%4 : " + a_f.mod(2, 4));     // Module
	}
}
```
#### Arithmetic_functions.java:
```
package Calculator;

public class arthimatic_function {
	
	// Addition Function
	float sum(float a, float b) {
		return (a + b);
	}
	
	// Subtraction Function
	float sub(float a, float b) {
		return (a - b);
	}
	
	// Multiply Function
	float mul(float a, float b) {
		return (a * b);
	}
	
	// Divide Function
	float div(float a, float b) {
		return (a / b);
	}
	
	// Module Function
	float mod(float a, float b) {
		return (a % b);
	}
}
```
#### Math_Operators.java:
```
package Calculator;

public class math_operators {
	
	// Exponent Function
    double exp(double x) {
		
    	math_operators m_o = new math_operators();
		
		double t = 0;
		
		for (double n = 0; n <= 14; n++) {
			
			t = t + (m_o.pow(x, n) / m_o.fac(n));
		}
		
		return t;
	}
    
    // Power Function
    double pow(double b, double p) {    // b : base, p : power
		double t = 1;
		
		for (double i = 1; i <= p; i++ ) {
			t = t*b;
		}
		
		return t;
	}
    
    // Factorial Function
    double fac(double f) {
		double t = 1;
		
		for (double i = 1; i <= f; i++) {
			t = t * i;
		}
		
		return t;
	}
    
    // Square Root Function
    double sqrtt(double a) { 
    	double temp;

    	double sqrt = a / 2;

    	do {
    		temp = sqrt;
    		sqrt = (temp + (a / temp)) / 2;
    	} while ((temp - sqrt) != 0);

    	return sqrt;
        }
}
```
#### Trigonometric_Functions.java:
```
package Calculator;

public class trignometric_function {

	double sin(double x) {
		
		math_operators m_o = new math_operators();
		
		double t = 0;
				
		for(double n = 0; n < 14; n++) {
			
			t = t + ((m_o.pow(-1, n) * m_o.pow(x, 2 * n + 1)) / m_o.fac(2 * n + 1) );
		}
		
		return t;
	}
	
	double cos(double x) {
		
		math_operators m_o = new math_operators();
		
		double t = 0;
				
		for(double n = 0; n < 14; n++) {
			
			t = t + ((m_o.pow(-1, n) * m_o.pow(x, 2 * n)) / m_o.fac(2 * n) );
		}
		
		return t;
	}
	
	double tan(double x) {
		
		trignometric_function t_f = new trignometric_function();
		
		double t = 0;
		
		t = (t_f.sin(x) / t_f.cos(x));
		
		return t;
	}
	
   double cot(double x) {
		
	   new trignometric_function();
		
		double t = 0;
		
		t = (1 / tan(x));
		
		return t;
	}
   
   double sec(double x) {
		
	   new trignometric_function();
		
		double t = 0;
		
		t = (1 / cos(x));
		
		return t;
	}
   
   double cosec(double x) {
		
	   new trignometric_function();
		
		double t = 0;
		
		t = (1 / sin(x));
		
		return t;
	}
} 
```
### Code Output:
```
Sin(2) : 0.9092974268256817
Cos(2) : -0.41614683654714246
Tan(2) : -2.1850398632615184
Cot(2) : -0.4576575543602859
Sec(2) : -2.4029979617223804
Cosec(2) : 1.0997501702946164
2x10^2 : 7.3890560703259105
2! : 2.0
2^2 : 4.0
sqrt(4) : 2.0
2+2 : 4.0
2-4 : -2.0
2*2 : 4.0
4/2 : 2.0
2%4 : 2.0
```
