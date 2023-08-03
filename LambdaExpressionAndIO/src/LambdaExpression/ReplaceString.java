package LambdaExpression;

import java.util.Scanner;

interface reverse{
	public void reverse();
}

public class ReplaceString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String name = sc.nextLine();
		reverse r= () -> {
			
			String str1 = name.replaceAll("[aeiouAEIOU]", "#");
			System.out.println(str1);
		};
		r.reverse();
    	
		
	}
}
