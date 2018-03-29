package abhishek;

public class DaemonThread extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread works ");
		}
		else
		{
			System.out.println("user thread works");
		}
	}
	public static void main(String args[])
	{
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		DaemonThread d3 = new DaemonThread();
		d1.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
	}
}