package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidDimensionException extends Exception {
	public InvalidDimensionException(String message) {
		super(message);
	}
}

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter the length of Reactangle: ");
			int l = sc.nextInt();
			System.out.print("Enter the width of Reactangle: ");
			int w = sc.nextInt();
			int area;
			if (l <= 0 || w <= 0) {

				throw new InvalidDimensionException("Enter valid dimensions");

			} else {
				area = l * w;
				System.out.println("The Area of Reactangle is: " + area);
			}
		} catch (InvalidDimensionException  | InputMismatchException ex ) {
			System.out.println("Enter valid dimensions");
		}

	}
}
