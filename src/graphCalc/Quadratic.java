package graphCalc;
public class Quadratic extends EquationSuper{
 
	double a;
	double b;
	double c;
	
	public Quadratic (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calculate (double x) {
		return (a * (x * x)) + (b * x) + c;
	}
}