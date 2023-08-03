package Loops;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int  rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		while (num != 0) {
            int r = num % 10;
            rem = rem * 10 + r;
            num = num/10;
		}
		System.out.print("The reverse of the number is:"+rem);
	}
}
