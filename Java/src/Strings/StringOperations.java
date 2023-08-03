package Strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	String name="Rituja";
    	String lname="Kekatpure";
    	
    	StringBuilder sb = new StringBuilder("Shruti");
    	
    	//Calculate String length
    	System.out.println("Length of String name:"+name.length());
    	System.out.println("Length of String lname:"+lname.length());
    	
    	//String Concatination
    	name=name.concat(lname);
    	System.out.println("String Concatinated full Name:"+name);
    	System.out.println("String Append:"+sb.append("Kekatpure"));
    	
    	//Getting Character from a given position
    	System.out.print("Enter the position:");
    	int pos = sc.nextInt();
    	System.out.println("The character at "+pos+" is "+name.charAt(pos-1));
    	
    	//Check if String Starts with a Character
    	 System.out.println("String "+name+"Starts with"+" Rit "+name.startsWith("Rit"));
    	 
    	 //Finding Index of given Character or String 
    	 System.out.println("Index of character t in name is:"+name.indexOf("t"));
    	 System.out.println("Index of String ru is :"+sb.indexOf("ru"));
    	 
    	 //Replace a Character
    	 System.out.println("Replace name "+name +" => "+name.replace('a', 'e'));
    	 System.out.println("Replace String sb "+sb.replace(2, 5, "pqrs"));
    	
    	 
    	
    }
}
