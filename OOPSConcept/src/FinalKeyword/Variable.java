package FinalKeyword;

public class Variable {
	
	int i = 10;
     
	public int sum ()
	{
		i=20;
//		j=33;
		return i;
	}
	
	final int j = 20;
	// cannot change the value of final variable
    //	j=30;
	
	public static void main(String[] args)
	{
		Variable v = new Variable();
		v.i=55;
//		v.j=30;
		int result = v.sum();
		System.out.println("Value of i is updated:"+v.i);
		System.out.println(result);
	}
	

}
