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
