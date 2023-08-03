package Arrays;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements :");
		for ( i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
       int largest = arr[0];
       for( i=1;i<n;i++)
       {
    	   if(arr[i]>largest)
    	   {
    		   largest=arr[i];
    	   }
       }
       System.out.println("Largest Element of Array:"+largest);
       
}
}