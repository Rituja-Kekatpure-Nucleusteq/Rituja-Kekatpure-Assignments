package InnerClass;


interface A
{
	int age = 18;
	void checkAge();
	
}
public class AnonymousClass {
   public static void main(String[] args)
   {
	   //implementing inetrface
	   A a = new A() {
		 public  void checkAge()
		   {
			  if(age>=18) 
			  {
				  System.out.println("You are ready to vote");
			  }
			  else
			  {
				  System.out.println("Not eligible");
			  }
		   }
	   };
	   a.checkAge();
	   
   }
}
