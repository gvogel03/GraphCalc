package graphCalc;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
public class Visual {
	int length;
	int height;
	int increment;
	DrawingPanel square = new DrawingPanel(5, 5);
	Graphics g = square.getGraphics();
	public Visual(int length, int height, int increment){
		this.length = length * increment;
		this.height = height * increment;
		this.increment = increment;
		square = new DrawingPanel(length * increment, height * increment);
		g = square.getGraphics();	
	}
	public void graph(){
		g.drawLine(0, height/2, length, height/2);
		g.drawLine(length/2,0, length/2, height);
		for(int i = 0; i < length; i+=increment){
			g.drawLine(i, height/2 - 2, i, height/2 + 2);
		}
		for(int j = 0; j < height; j+=increment){
			g.drawLine(length/2 -2, j, length/2 + 2, j);
		}
		g.drawLine(length + 1, height/2, length-3, height/2 -2);
		g.drawLine(length + 1, height/2, length-3, height/2 + 2);
		g.drawLine(length/2, height+1, length/2-2, height-3);
		g.drawLine(length/2, height+1, length/2 + 2, height-3);
		}
	public void graphPoints(double ydub, double xdub){
		int x = (int) xdub;
		int y = (int) ydub;
		System.out.println("x" + x +" y " + y);
		
		//g.drawLine(length/2 + (x * increment) - 1, height /2 - (y*increment) - 1, length/2 + (x*increment) + 1, height/2 - (y*increment)+1);
		//g.drawOval(length/2 + (x * increment), height /2 - (y*increment), length/2 + (x*increment), height/2 - (y*increment));
		g.drawOval(length/2 + (int)(x * increment),  height /2 - (int)(y*increment), 1, 1);
	}
}