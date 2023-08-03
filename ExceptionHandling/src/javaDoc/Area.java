package javaDoc;

import java.util.Scanner;



@FunctionalInterface
interface Area_all {
	public void display();
}

/*
 * This is the class to demonstrate java doc
 * 
 * @author Rituja
 * @version 0.1
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html" target="_blank">JavaDocs</a>
 */
public class Area implements Area_all {

	double r, l, b, w, h, area;

	/**
	 * 
	 * This method is used to find the area of Rectangle
	 * @param l This is the length of rectangle
	 * @param w This is the width of rectangle
	 * @return area of rectangle
	 */
	public double rectangle(double l, double w) {

		this.l = l;
		this.w = w;
		return l * w;
	}
	/**
	 * This method is used to find the area of Triangle
	 * @param b This is base of triangle
	 * @param h This is height of triangle
	 * @return area of  triangle
	 */
	public double triangle(double b, double h) {

		this.b = b;
		this.h = h;
		return (b * h) / 2;

	}

	/**
	 * This method is used to find the area of Circle
	 * @param r This is radius of circle
	 * @return area of circle
	 */
	public double circle(double r) {

		this.r = r;
		return 3.14 * r * r;

	}

	@Override
	public void display() {
		System.out.println("The method is overriden from interface to find the Area of Shapes");
	}
	
	/**
	 * 
	 * @param args These are arguments supplied to command line
	 */
	public static void main(String[] args) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		a.display();
		System.out.println("The area of Rectangle:" +a.rectangle(2.4,33.3));
		System.out.println("The area of Triangle:" +a.triangle(6,3));
	System.out.println("The area of Circle is :" +a.circle(22));
}
}
