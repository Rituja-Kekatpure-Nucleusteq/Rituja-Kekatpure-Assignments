package multithreadingconcept;

class Test extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadName {
   public static void main(String[] args) {
	Test t1 = new Test();
	Test t2 = new Test();
	Test t3 = new Test();
	t1.setName("First Thread");
	t2.setName("Second Thread");
	t3.setName("Third Thread");
	t1.start();
	t2.start();
	t3.start();
	
}
} 
