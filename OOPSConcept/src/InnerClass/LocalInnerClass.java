package InnerClass;

class Outer
{
	int x = 32;
	 void getData()
	 {
		 System.out.println("Inside the Method of Outer class");
		 
		 class Inner{
			 
			public  void sum()
			 {
				 int y = 44;				 
				 int sum = x+y;
				 System.out.println("Inside Local Inner class");
				 System.out.println("The sum of x: "+x+" and "+y+" is "+sum);
			 }
		 }
		 Inner inner = new Inner();
		 inner.sum();
	 }
	}
public class LocalInnerClass {
      public static void main(String[] args)
      {
    	  Outer o = new Outer();
    	  o.getData();
      }
}
