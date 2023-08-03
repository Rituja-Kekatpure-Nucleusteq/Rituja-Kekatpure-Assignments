package StaticKeyword;

public class Employee {
     String name;
     String address;
     
     //static variable
     static String company ="Nucleusteq";
     
     Employee(String name , String address)
     {
    	 this.name = name;
    	 this.address = address;
     }
     
     void info()
     {
    	 System.out.println("Name of Employee:"+name);
    	 System.out.println("Address of Employee:"+address);
    	 System.out.println("Company of Employee:"+company);
     }

	public static void main(String[] args)
	{
		Employee e1 = new Employee("Rituja","Betul");
		Employee e2 = new Employee("Shruti","Betul");
		e1.info();
		e2.info();
	}
  
}
