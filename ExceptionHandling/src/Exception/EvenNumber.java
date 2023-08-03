package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class NotEvenNumberException extends Exception {
	public NotEvenNumberException(String message)
	{
		super(message);
	}
}
public class EvenNumber {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   try 
	   {
		   System.out.print("Enter the number");
		   int num = sc.nextInt();
		   if(num%2==0)
		   {
			   System.out.println("Even Number");
		   }
		   else
		   {
			   throw  new NotEvenNumberException("Enter a valid even number");
		   }
	   }
	   catch(NotEvenNumberException |InputMismatchException ex)
	   {
		   System.out.println(ex.getMessage());
	   }
   }
}
