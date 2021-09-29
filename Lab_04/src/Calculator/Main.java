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
