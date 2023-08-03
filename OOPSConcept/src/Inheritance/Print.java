package Inheritance;

//Hierarchial
class A {
	public void action() {
		System.out.println("Method of  class A");
	}
}

class B extends A {
	public void action_B() {
		System.out.println("Method of  class B");
	}
}

class C extends A {
	public void action_C() {
		System.out.println("Method of  class C");
	}
}

public class Print {
	public static void main(String[] args) {
          B b = new B();
          System.out.println("By Class B ");
          b.action();
          b.action_B();
          
          C c = new C();
          System.out.println("By Class C");
          c.action();
          c.action_C();
          
	}
}
