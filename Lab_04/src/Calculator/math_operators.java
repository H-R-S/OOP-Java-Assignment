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
