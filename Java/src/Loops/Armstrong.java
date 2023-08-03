package Loops;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int count = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		while (num != 0) {
			num = num / 10;
			count++;
		}
//		System.out.println(count);
		while (num != 0) {
			num = num % 10;
			sum += Math.pow(num, count);
			num = num / 10;
		}
		if(num==sum)
		{
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
