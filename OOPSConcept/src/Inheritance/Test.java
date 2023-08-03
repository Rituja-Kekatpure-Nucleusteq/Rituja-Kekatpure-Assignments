package Inheritance;

//single Inheritance
class Person {

	String name = "Rituja";
	int salary = 60000;
}

class Benefits extends Person {
	int benefits = 2000;
}
public class Test
{
	public static void main(String[] args)
	{
		Benefits b = new Benefits();
		System.out.println("Name:"+b.name+" "+"Salary:"+b.salary+" "+"Benefits:"+b.benefits);
	}
}

