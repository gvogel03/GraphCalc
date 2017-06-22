package graphCalc;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
public class drawPanel {
	 static DrawingPanel square = new DrawingPanel(750,500);
	 static Graphics g = square.getGraphics();
	 public static void drawLine(){
	 for(int j = 30; j<1000; j+=30){
			g.drawLine(0, j, 1000, j);
	 }
	 }
	 public static void drawSquare(){
		 int j = 0;
		 int i = 0;
		 g.setColor(Color.BLACK);
	     g.fillRect(i, j, 30, 30);
	     i+=30;
		 }
	 public static void drawRow(){
		    int i = 0;
		    int z = 1;
		    for(int j = 30; j<1000; j+=30){
		    	if(z % 2 !=0){
		    		i = 15;
		    	
		    	}
		    	for(int q = 0;i < 1000; i+=60){
		    		g.setColor(Color.BLACK);
		    		g.fillRect(i, j, 30, 30);
		    		z++;
		    		
		    		}
		    	i = 0;
		    	}
	 }
	 public static void main(String[]args){
		 drawLine();
		 drawRow();
	 }
	}


