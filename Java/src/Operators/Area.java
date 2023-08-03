package Operators;

import java.util.Scanner;

public class Area {
      public static void main(String[] args)
      {
    	  float area=0;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.print("Enter the base of Triangle :");
    	  float b = sc.nextFloat();
    	  System.out.print("Enter the height of Triangle");
    	  float h = sc.nextFloat();
    	  area = (b*h)/2;
    	  System.out.println("Area of Triangle :"+area);
    			  
      }
}
