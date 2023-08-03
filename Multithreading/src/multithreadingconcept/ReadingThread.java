package multithreadingconcept;

class Read extends Thread
{
	String message;
	public Read(String m)
	{
		this.message = m;
	}
	
	public void run()
	{
		System.out.println("The message of: "+Thread.currentThread().getName()+" is "+message);
	}
}
public class ReadingThread {
    public static void main(String[] args) {
		Read thread1 = new Read("I am thread 1");
		Read thread2 = new Read("I am thread 2");
		Read thread3 = new Read("I am thread 3");
		Read thread4 = new Read("I am thread 4");
		Read thread5 = new Read("I am thread 5");
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread3.setName("thread3");
		thread4.setName("thread4");
		thread5.setName("thread5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	}
}
