package StaticKeyword;

// static block 
public class Test {
   
	int i;
	static int j;
	
	static 
	{
		j=10;
		System.out.println("Static Block 1");
	}
	public void check()
	{
		System.out.println("Method in class Test");
	}
	
	static 
	{
		System.out.println("Static Block 2");
	}

	public static void main(String[] args)
	{
		Test t = new Test();
		t.check();
		System.out.println("Main Method");
		System.out.println("The value of i:"+t.i);
	}
}
