package StaticClass;

public class TestStaticClass {
   static int i = 30;
   int j = 44;
   
   static class Inner
   {
	   //non-static method
	   void display()
	   {
		   System.out.println("The value of static variable i :"+i);
		   // cannot access non-static data
		 //  System.out.println("The value of non-static variable j:"+j);
	   }
	   
	   //static method
	 static  void print()
	   {
		   System.out.println("Inside static method of static class");
	   }
	   
   }
   
   public static void main(String[] args)
   {
	   TestStaticClass.Inner t = new TestStaticClass.Inner();
	   t.display();
	   // static method can be called by class name
	   TestStaticClass.Inner.print();
   }
	
}
