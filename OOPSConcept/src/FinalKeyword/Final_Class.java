package FinalKeyword;

final class A {
	
	void data()
	{
		System.out.println("We cannot extend final class");
	}
     
}
//class B extends A
//{

//    void data()
//    {
//    	System.out.println("No Overriding as class A is Final");
//    }
//	void show()
//	{
//		System.out.println("Cannot extend class A");
//	}
//}

class Final_Class
{
	public static void main(String[] args)
	{
		A a = new A();
		a.data();
		System.out.println("It provides Security to some useful Information");
	}
}
