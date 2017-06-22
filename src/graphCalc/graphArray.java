package graphCalc;
import java.lang.reflect.Array;
public class graphArray {
	private int length;
	private int height;
	private String selection;
	private double[]array;
	private double[][]graph;
	public graphArray(int length, int height, String selection){
		this.length = length;
		this.height = height;
		this.selection = selection;
		this.array = new double[length * 2 + 1];
		this.graph = new double[length][height];
	}	
}
