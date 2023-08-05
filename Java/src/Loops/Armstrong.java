package Loops;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int count = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int temp = num,r;
		int digit = num;
		while (num != 0) {
			num = num / 10;
			count++;
		}
//		System.out.println(count);
//		System.out.println(num);
		while (digit  != 0) {
			r = digit % 10;
			sum += Math.pow(r, count);
			digit = digit / 10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
