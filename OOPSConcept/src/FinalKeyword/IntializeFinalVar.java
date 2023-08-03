package FinalKeyword;

public class IntializeFinalVar {

	// declaration
	final String name = "Rituja";
	final int age;
	final String lname;

	// by instance block
	{
		this.age = 23;
	}

	// by  default constructor
	public IntializeFinalVar() {

		this.lname = "Kekatpure";	
	}
	
	public void display()
	{
		System.out.println("Details:"+name+" "+lname+" "+age);
	}

	public static void main(String[] args) {
		 IntializeFinalVar i = new  IntializeFinalVar();
		 i.display();
		 
	}
}
