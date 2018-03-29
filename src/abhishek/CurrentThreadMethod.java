package abhishek;

public class CurrentThreadMethod extends Thread{
	public void run()
	{
		System.out.println("naming of thread : " + Thread.currentThread().getName());
		System.out.println("priority of thread : " + Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		CurrentThreadMethod c1 = new CurrentThreadMethod();
		CurrentThreadMethod c2 = new CurrentThreadMethod();
		CurrentThreadMethod c3 = new CurrentThreadMethod();
		c1.setPriority(Thread.MAX_PRIORITY);
		c2.setPriority(Thread.MIN_PRIORITY);
		c3.setPriority(Thread.NORM_PRIORITY);
		c1.start();
		c2.start();
		c3.start();
	}
}