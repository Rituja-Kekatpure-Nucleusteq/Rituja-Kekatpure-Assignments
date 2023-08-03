package Polymorphism;

//method overloading
public class Demo {
     
	public void sum(int a ,int b,int c)
	{
		int sum = a+b+c;
		System.out.println("sum with 3 numbers:"+sum);
	}
	
	public void sum(int a , int b)
	{
		int sum = a+b;
		System.out.println("sum with 2 numbers:"+sum);
	}
	
	public void sum(double a , double b)
	{
		double sum = a+b;
		System.out.println("sum with double type:"+sum);
	}
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.sum(1, 5);
		d.sum(43, 23,33);
		d.sum(2.3,3.4);
		
		
	}
}

