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
