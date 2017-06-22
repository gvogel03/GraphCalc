package graphCalc;

public class LinearToLinear extends EquationSuper{
	public double a;
	public double b;
	public double c;
	public LinearToLinear(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double calculate(double x){
		return (x * a + b)/(x + c);
	}
}
