package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		
		if (shape.equals("ellipse")) {
			Color ellipseColor = new Color(in.nextInt(), in.nextInt(), in.nextInt());
			StdDraw.setPenColor(ellipseColor);
			if (in.nextBoolean() == true) {
				StdDraw.filledEllipse(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			}
			else {
				StdDraw.ellipse(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			}
		}

		if (shape.equals("rectangle")) {
			Color rectangleColor = new Color(in.nextInt(),in.nextInt(),in.nextInt());
			StdDraw.setPenColor(rectangleColor);
			if (in.nextBoolean() == true) {
				StdDraw.filledRectangle(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			}
			else {
				StdDraw.rectangle(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			}
		}

		if (shape.equals("triangle")) {
			Color triangleColor = new Color(in.nextInt(),in.nextInt(),in.nextInt());
			StdDraw.setPenColor(triangleColor);
			if (in.nextBoolean() == true) {
				double[] x = {in.nextDouble(),in.nextDouble(),in.nextDouble()};
				double[] y = {in.nextDouble(),in.nextDouble(),in.nextDouble()};
				StdDraw.filledPolygon(x, y);
			}
			else {
				double[] x = {in.nextDouble(),in.nextDouble(),in.nextDouble()};
				double[] y = {in.nextDouble(),in.nextDouble(),in.nextDouble()};
				StdDraw.polygon(x, y);
			}
		}
		System.out.println("Hi");
	}
}
