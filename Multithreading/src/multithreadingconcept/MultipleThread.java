package multithreadingconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MultipleThread extends Thread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultipleThread mt = new MultipleThread() {
			public void run() {

				System.out.print("The numbers below 3 are: ");
				for (int i = 1; i < 3; i++) {
					System.out.println(i);
				}
			}

		};

		mt.start();

		MultipleThread mt2 = new MultipleThread() {
			public void run() {
				System.out.println("Fibonacci Series");

				int a = 0, b = 1;
				System.out.print(a + " " + b + " ");
				for (int i = 3; i <= 10; i++) {

					int c = a + b;
					System.out.print(c + " ");
					a = b;
					b = c;

				}
			}
		};
		mt2.start();

		
		MultipleThread mt3 = new MultipleThread() {
			public void run()
			{
				
				int sum = 0;
				for(int i=1;i<=10;i++)
				{
					sum +=i;
				}
				System.out.println("Sum of numbers is:" +sum);
			}
		};
		mt3.start();
		
		MultipleThread mt4 = new MultipleThread() {
			public void run()
			{
				List<Integer> list = new ArrayList();
				list.add(10);
				list.add(40);
				list.add(60);
				list.add(90);
				
				Collections.reverse(list);
				System.out.println("List after reversing:"+list);
				
		}
		};
		mt4.start();
		
		
	}
}
