package graphCalc;
public class Linear extends EquationSuper{
	 
	double m;
	double b;
	
	public Linear(double m, double b) {
		this.m = m;
		this.b = b;
	}
	
	public double calculate (double x) {
		return (m * x) + b;
	}
}
