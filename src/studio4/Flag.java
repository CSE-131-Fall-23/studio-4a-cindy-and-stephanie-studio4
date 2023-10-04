package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		StdDraw.setPenColor(102, 102, 255);
		StdDraw.filledRectangle(0, 0, .3, .3);
		StdDraw.filledRectangle(0, .7, .3, .3);
		StdDraw.filledRectangle(.7, 0, .3, .3);
		StdDraw.filledRectangle(.7, .7, .3, .3);
		StdDraw.setPenColor(255, 153, 255);
		StdDraw.ellipse(.71, .68, .07, .07);
		StdDraw.filledEllipse(.74, .7, .01, .01);
		StdDraw.filledEllipse(.68, .7, .01, .01);
		StdDraw.arc(.71, .67, .04, 180, 0);
	}
}