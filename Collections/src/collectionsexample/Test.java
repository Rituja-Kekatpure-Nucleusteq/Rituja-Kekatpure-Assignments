package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the elements in the list:");
		for (int i = 0; i < 20; i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("List Before Reverse :" + list);
		Collections.reverse(list);
		System.out.println("List After Reverse :" + list);
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) > 50) {
				list.set(i, list.get(i) + 5);
			}
		}
		System.out.println("List After Increment :" + list);
		System.out.print("Elements less than 60 :");
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j) < 60) {
				System.out.print(list.get(j) + " ");
			}
		}
	}
}
