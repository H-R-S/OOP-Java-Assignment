
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
