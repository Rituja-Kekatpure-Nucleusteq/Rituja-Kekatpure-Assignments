package Polymorphism;

//overriding 
public class A {
    
	public void speaks(int a)
	{
		System.out.println("Speaks only Hindi");
	}
	
}
class B extends A
{
	 public void speaks(int a)
	 {
		 System.out.println("Speaks Hindi, English");
	 }
	 
	 public static void main(String[] args)
	 {
		 A a = new B();
		 a.speaks(2);
	 }
}
