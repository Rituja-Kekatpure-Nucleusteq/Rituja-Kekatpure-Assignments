package Inheritance;

//Multiple Inheritance Example
interface One
{
	public void one();
}
interface Two {
	public void two();
}
interface Three extends One,Two
{
	public void three();
}
class Example implements Three
{
	@Override
	public void one()
	{
		System.out.println("Method of interface A");
	}

	@Override
	public void three() {
	
		System.out.println("Method of interface B");
	}

	@Override
	public void two() {
		
		System.out.println("Method of interface C");
	}
	
}
public class Main {
     public static void main(String[] args)
     {
    	 Example ex = new Example();
    	 ex.one();
    	 ex.two();
    	 ex.three();
    	 
     }
}
