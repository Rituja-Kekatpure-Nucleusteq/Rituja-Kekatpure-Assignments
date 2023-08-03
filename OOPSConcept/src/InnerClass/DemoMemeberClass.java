package InnerClass;



public class DemoMemeberClass {
    
	private int x = 10;
	private int y=20;
	int sum ()
	{
		return x+y;
	}
	class Inner
	{
		void print()
		{
			//Inner class can access private data and methods
			System.out.println("The value of x: " +x);	
			System.out.println("The value of y: " +y);
			int result = sum();
		    System.out.println("The sum of x and y is :"+result);
		}
		
	}
	
	public static void main(String[] args)
	{
		 DemoMemeberClass outer = new  DemoMemeberClass();
		 DemoMemeberClass.Inner in = outer.new Inner();
		 in.print();
	}
}

