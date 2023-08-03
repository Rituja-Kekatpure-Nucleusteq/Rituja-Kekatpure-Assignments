package LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface Shapes
{
	public void area();
	
}
public class AreaOfShapes {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		Shapes s = ()->
		{
			System.out.println("Area of Reactangle:");
			System.out.print("Enter the value of l:");
			double l = sc.nextDouble();
			System.out.print("Enter the value of b:");
			double b= sc.nextDouble();
			System.out.println("Area of Reactangle:"+l*b);
			
		};
		
		s.area();
		
		Shapes s1 = ()->
		{
			System.out.println("Area of Square:");
			System.out.print("Enter the value of side:");
			double side = sc.nextDouble();
			
			System.out.println("Area of square: "+side*side);
		};
		
		s1.area();
		

		
		Shapes s2 = ()->
		{
			System.out.println("Area of cube:");
			System.out.print("Enter the value of side:");
			double side = sc.nextDouble();
			
			System.out.println("Area of cube: "+6*side);
		};
		
		s2.area();
		
	
		
		Shapes s3 = ()->
		{
			System.out.println("Area of Sphere:");
			System.out.print("Enter the value of radius:");
			double radi = sc.nextDouble();
			
			System.out.println("Area of Sphere: "+4*3.14*radi*radi);
		};
		
		s3.area();
		
	
		
		Shapes s4 = ()->
		{
			System.out.println("Area of Cylinder:");
			System.out.print("Enter the value of radius:");
			double radi= sc.nextDouble();
			System.out.print("Enter the value of height:");
			double h= sc.nextDouble();
			
			System.out.println("Area of cylinder: "+(2*3.14*radi*(h+radi)));
		};
		
		s4.area();
		
	}
}
