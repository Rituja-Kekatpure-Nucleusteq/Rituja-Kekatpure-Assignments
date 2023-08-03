package Operators;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		double r1, r2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		double a = sc.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = sc.nextDouble();
		System.out.print("Enter the value of c:");
		double c = sc.nextDouble();
		// determinent
		double d = b * b - 4 * a * c;
		if (d > 0) {
			// roots are real and different
			r1 = (-b + Math.sqrt(d)) / (2 * a);
			r2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.println("root1:" + r1 + " " + "root2:" + r2);
		} else if (d == 0) {
			// roots are equal and real
			r1 = r2 = (-b) / (2 * a);

			System.out.println("roots are same:" + r1);
		} else {
			// roots are imaginary and real
			double r = -b / (2 * a);
			double im = Math.sqrt(-d) / (2 * a);
//			r1 = r + im;
//			r2 = r - im;
			System.out.println("Roots are:");
			System.out.println(r+"i"+im);
			System.out.println(r+"-i"+im);

		}

	}
}
