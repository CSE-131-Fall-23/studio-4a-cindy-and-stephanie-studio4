package studio4;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shapeType = in.next();
		int red = in.nextInt();
		int green= in.nextInt();
		int blue = in.nextInt();
		boolean isFilled= in.nextBoolean();
		double x1= in.nextDouble();
		double y1= in.nextDouble();
		double x2= in.nextDouble();
		double y2= in.nextDouble();

		StdDraw.clear();
		StdDraw.setPenColor(red, green, blue);
		if (shapeType .equals("rectangle"))
		{
			StdDraw.filledRectangle(x1, y1, x2, y2);
		}
		if (shapeType .equals("ellipse"))
		{
			StdDraw.filledEllipse(x1, y1, x2, y2);
		}
		if (shapeType .equals("triangle"))
		{
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double Xarray [] = {x1, x2, x3};
			double Yarray [] = {y1, y2, y3};
			StdDraw.polygon(Xarray, Yarray);
		}
	}
}
