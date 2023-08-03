package InnerClass;

abstract class Lion {
	abstract void run();
	void display()
	{
		System.out.println("Abstract Class Lion ");
	}
}

public class AnonymousInnerclass {
	public static void main(String[] args)
      {
    	  Lion a = new Lion()
    			  {	 
    		  public void run()
    		  {
    			  System.out.println("Lion  runs Fast  ");
    		  }
    			  };
    	a.run();
    	a.display();
    	  
      }
}
