package Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringElemnetAccess {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("Java");
		str.add("python");
		str.add("c Language");
		str.add("Cpp");
		str.add("React Js");

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter the index to access the data: ");
			int i = sc.nextInt();

			if (str.isEmpty()) {
				throw new NullPointerException("The list is Empty");
			} else if (i < 0 || i >= str.size()) {
				throw new IndexOutOfBoundsException("Invalid Index");
			} else {
				String element = str.get(i);
				System.out.println("Element at index: " + i + " is  " + element);
			}
		} catch (NullPointerException | IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
