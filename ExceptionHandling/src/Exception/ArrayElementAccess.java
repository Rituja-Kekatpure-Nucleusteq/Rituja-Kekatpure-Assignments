package Exception;

import java.util.Scanner;

public class ArrayElementAccess {
   public static void main(String[] args)
   {
	   int a[] = {10,21,33,54,5};
	   Scanner sc = new Scanner(System.in);
	   
	   try
	   {
		   System.out.print("Enter the index: ");
		   int i = sc.nextInt();
		   if(i<=0||i>=a.length)
		   {
			   throw new IndexOutOfBoundsException("Invalid index");
		   }
		   else if(a == null)
		   {
			   throw new NullPointerException("The array is null");
		   }
		   else {
			   int element = a[i];
			   System.out.println("Element is: "+element+" at index "+i);
		   }
	   }
	   catch(NullPointerException | IndexOutOfBoundsException ex )
	   {
		   System.out.println(ex.getMessage());
	   }
	   
   }
}
