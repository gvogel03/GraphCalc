package graphCalc;
public class Exponential extends EquationSuper {
	
	double a;
	double b;
	public Exponential(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double calculate(double x){
		return a * Math.pow(b, x);
	}
}
