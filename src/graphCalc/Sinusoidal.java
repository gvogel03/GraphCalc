package graphCalc;

public class Sinusoidal extends EquationSuper{
	double a;
	double b;
	double c;
	double d;
	public Sinusoidal(double a, double b, double c, double d){
		this. a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public double calculate(double x){
		return a * Math.sin(2 * Math.PI/b *(x + c)) + d;
	}
}
