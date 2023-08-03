package Loops;

import java.util.Scanner;

public class Palindrome {
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
		System.out.println("The reverse of the number is:"+rem);
		if(rem==num) {
			System.out.println("The number is Palindrome");
		}
		else
		{
			System.out.println("The number is not Palindrome");
		}
	}
}
