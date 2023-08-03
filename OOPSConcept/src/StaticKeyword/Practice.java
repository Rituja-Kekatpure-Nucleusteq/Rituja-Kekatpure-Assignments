package StaticKeyword;

class A {

	String name = "John";
	static String college = "SGSITS";

	// static method
	static int sum(int a, int b) {
		
		// static variable accessible in static method
		college = "VVM";
		System.out.println("college name:" + college);

		return a + b;
		// non-static variables non -accesible
		//name = "shruti";
	}
	
	// non-static method 
	public void nonStatic()
	{
		System.out.println("Name: "+name+" "+"College: "+college);
		System.out.println("non static method");
	}
}

public class Practice {
	public static void main(String[] args) {
		
		// static method accessed by class name
		int result = A.sum(10, 32);
		System.out.println("Sum: " + result);
		
		//non-static method accessed by object
		A a = new A();
		a.nonStatic();
	}
}