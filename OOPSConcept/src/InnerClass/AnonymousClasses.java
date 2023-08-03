package InnerClass;

class Polygon{
	void print()
	{
	System.out.println("Inside Polygon class");
	}
}
public class AnonymousClasses {
    public static void main(String[] args)
    {
    	Polygon p = new Polygon() {
    		public void print()
    		{
    			System.out.println("Inside Anonymous Class");
    		}
    		
    	};
    	p.print();
    	
    }
}
