
package collectionsexample;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CollectionsExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		LinkedHashSet<String> hashSet2 = new LinkedHashSet<String>();
		hashSet2.add("abc");
		hashSet2.add("xyz");
		hashSet2.add("abcde");
		System.out.print("Enter the elements");
		for (int i = 0; i < 20; i++) {
			hashSet.add(scanner.next());

		}
		System.out.print("Elements in Set: " + hashSet);
		System.out.println("Elements in Set2: " + hashSet2);
		System.out.println("Size of set1  :" + hashSet.size());
		System.out.println("Adding both set :" + hashSet2.addAll(hashSet));
		System.out.println(hashSet.contains("abc"));

		hashSet2.remove("abcde");
		System.out.println("Set After removal of abcde:" + hashSet2);

		hashSet2.removeAll(hashSet);
		System.out.println(hashSet2);
		System.out.println("Is Set1 is empty: " + hashSet.isEmpty());

	}
}