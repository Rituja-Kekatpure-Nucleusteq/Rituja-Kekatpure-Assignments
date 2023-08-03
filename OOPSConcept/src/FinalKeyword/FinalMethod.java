package FinalKeyword;

class A1 {
	public void show() {
		System.out.println("Normal Method");
	}

	final void data() {
		System.out.println("Final method which we cannot override");
	}
}

class B extends A1 {
	public void show() {
		System.out.println("Normal method can be overridden");
	}

	// cannot override final method
//	  public void data()
//	 {
//		 System.out.println("We cannot override final methods");
//	 }
}

public class FinalMethod {
	public static void main(String[] args) {
		A1 a = new A1();
		a.data();
		a.show();

		B b = new B();
		b.show();
		//parent method called 
		b.data();
		
		System.out.println("By final class no method can be used in child class");
		System.out.println("By final method all other methods can be overidden ");
		

	}
}
