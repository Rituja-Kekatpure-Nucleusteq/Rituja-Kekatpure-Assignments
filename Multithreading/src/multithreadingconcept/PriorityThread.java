package multithreadingconcept;

class Priority extends Thread
{
	public void run()
	{
		System.out.println("The priority of: "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
	}
}
public class PriorityThread {
  

public static void main(String[] args) {
	Priority p1 = new Priority();
	Priority p2 = new Priority();
	Priority p3 = new Priority();
	Priority p4 = new Priority();
	
	p1.setName("First Thread");
	p2.setName("Second Thread");
	p3.setName("Third Thread");
	p4.setName("Fourth Thread");
	
	p1.setPriority(Thread.MAX_PRIORITY);
	p3.setPriority(Thread.MIN_PRIORITY);
	
	p2.setPriority(6);
	p4.setPriority(Thread.NORM_PRIORITY);
	
	p1.start();
	p2.start();
	p3.start();
	p4.start();
			
}
}
