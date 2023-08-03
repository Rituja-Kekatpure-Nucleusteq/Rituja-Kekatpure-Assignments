package Loops;

import java.util.Scanner;

public class Table {
   public static void main(String[] args)
   {
	   int t;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a Number :");
	   int num = sc.nextInt();
	   for(int i=1;i<=10;i++)
	   {
		  t = num*i;
		  System.out.println(num+"*"+i+"="+t);
	   }
   }
}
