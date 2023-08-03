package Operators;

import java.util.Scanner;

public class Bitwise {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a number a :");
	   int a = sc.nextInt();
	   System.out.print("Enter another number b:");
	   int b =sc.nextInt();
	   //bitwise OR
	   a=a|b;
	   System.out.println("Bitwise OR:"+a);
	   //bitwise AND
	   a=a&b;
	   System.out.println("Bitwise AND:"+a);
	   //bitwise XOR
	   a=a^b;
	   System.out.println("Bitwise XOR:"+a);
	   //bitwise  complement
	   a=~a;
	   System.out.println("Bitwise Complement:"+a);
	   
	   //bitwise operators can be used with assignment 
	   a&=b;
	   System.out.println("Bitwise with asssignment:"+a);
	   
	   //bitShifting left shift
	   a=a<<3;
	   System.out.println("Left Shift:"+a);
	   
	   //bitShifting right Shift
	   a=a>>3;
	   System.out.println("Right Shift:"+a);
	   
	   //unsigned right Shift
	   a=a>>>3;
	   System.out.println("Unsigned Right Shift:"+a);
			   
	   
   }
}
