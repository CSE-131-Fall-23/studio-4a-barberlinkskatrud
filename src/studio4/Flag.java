package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255,105,180);
		StdDraw.filledRectangle(.5, .5, .4, .2);
		for(int i=0; i<Math.random()*200+100; i++) {
			StdDraw.setPenColor((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
			StdDraw.setPenRadius(0.01);
			double xCoordinate = Math.random()*0.75 +0.15;
			double yCoordinate = Math.random()*0.35+0.35;
			StdDraw.point(xCoordinate, yCoordinate);
		}
		
	}
}