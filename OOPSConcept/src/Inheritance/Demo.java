package Inheritance;

//Multilevel

class First{
	
	public void name() {
		System.out.println("First Method");
	}
}
class Second extends First{
	public void name_Sec()
	{
		System.out.println("Second Method");
	}
}
class Third extends Second{
	
	public void name_Third() {
		System.out.println("Third Method");
	}
}
public class Demo {
     public static void main(String[] args)
     {
    	 Third th = new Third();
    	 th.name();
    	 th.name_Sec();
    	 th.name_Third();
     }
}
