package graphCalc;

import java.util.Scanner;

public class CommandThang {
 
	public static EquationSuper equation;
	static int length;
	static int height;
	static int increment;
	static int pointsPerX;
	public Object obj;
	static Scanner console = new Scanner(System.in);
	public static double[][] arr;
	
	public static void command() {
		
		System.out.println("Input graph length:");
		length = console.nextInt();
		System.out.println("Input graph height:");
		height = console.nextInt();
		System.out.println("Input point increment:");
		increment = console.nextInt();
		System.out.println("Input points per x value:");
		pointsPerX = console.nextInt();
		System.out.println("Enter Function Type:\na) Linear\nb) Quadratic\nc) Exponential\nd) Linear to Linear\ne) Sinusoidal");
		String selection = console.next();
		
		if(selection.equalsIgnoreCase("a")) {
			linear();
			fillArray();
		}
		
		if(selection.equalsIgnoreCase("b")) {
			quadratic();
			fillArray();
		}
		
		 
		if(selection.equalsIgnoreCase("c")){
			exponential();
			fillArray();
		}
				
		if(selection.equalsIgnoreCase("d")){
			linearToLinear();
			fillArray();
		}
		if(selection.equalsIgnoreCase("e")){
			sinusoidal();
			fillArray();
		}
		 
 
	}
	
	public static void linear() {
		System.out.print("Formula: y = mx + b\nEnter double value for m:");
		double m = console.nextDouble();
		System.out.print("Enter double value for b:");
		double b = console.nextDouble();
		equation = new Linear(m, b);
	}
	
	public static void quadratic() {
		System.out.print("Formula: y = ax^2 + bx + c\nEnter double value for a:");
		double a = console.nextDouble();
		System.out.println("Enter double value for b:");
		double b = console.nextDouble();
		System.out.println("Enter double value for c:");
		double c = console.nextDouble();
		equation = new Quadratic(a, b, c);
	}
	
	public static void exponential(){
		System.out.print("Formula: f(x) = ab^x \nEnter initial value for a:");
		double a = console.nextDouble();
		System.out.print("Enter rate of growth for b:");
		double b = console.nextDouble();
		equation = new Exponential(a, b);
	}
 
	public static void linearToLinear(){
		System.out.print("y = (ax + b)/(x + c) \nEnter asymptote for a:");
		double a = console.nextDouble();
		System.out.print("Enter double value for b:");
		double b = console.nextDouble();
		System.out.print("Enter double value for c:");
		double c = console.nextDouble();		
		equation = new LinearToLinear(a, b, c);
	}
 
	public static void sinusoidal(){
		System.out.println("Formula: f(x) = asin(2PI/b(x+c)) + d\nEnter amplitude for a:");
		double a = console.nextDouble();
		System.out.println("Enter period for b:");
		double b = console.nextDouble();
		System.out.println("Enter phase shift for c:");
		double c = console.nextDouble();
		System.out.println("Enter mean value for d:");
		double d = console.nextDouble();
		equation = new Sinusoidal(a, b, c, d);
	}
 
	public static void fillArray() {
		arr = new double[((length * 2) + 1) * pointsPerX - (pointsPerX - 1)][2];
		double currentNum = length * -1.0;
		for(int i = 0; i < arr.length; ++i) {
			arr[i][0] = equation.calculate(currentNum);
			arr[i][1] = currentNum;
			currentNum += 1.0 / pointsPerX;
		}
	}
	
	public static double[][] getArray() {
		return arr;
	}

	public static void main(String[] args) {
		command();
		Visual v = new Visual(length, height, increment);
		for(int i = 0; i < arr.length; ++i) {
			//System.out.print(arr[i][0] + ",");
			v.graphPoints(arr[i][0], arr[i][1]);
		}
		v.graph();
		
	}
	
}
 
