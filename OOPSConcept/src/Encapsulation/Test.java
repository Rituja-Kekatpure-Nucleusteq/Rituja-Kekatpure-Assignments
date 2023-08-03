package Encapsulation;

public class Test {
   public static void main(String[] args)
   {
	   Student s = new Student();
	   s.setName("Rituja");
	   s.setRollno(101);
	   
	   Student s1 = new  Student();
	   s1.setName("Shruti");
	   s1.setRollno(102);
	   
	   System.out.println(s);
	   System.out.println(s1);
	   
   }
}
