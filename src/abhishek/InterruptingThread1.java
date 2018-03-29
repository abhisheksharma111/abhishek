package abhishek;

public class InterruptingThread1 extends Thread
{
	public void run() 
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("thread running : ");
		}
		catch(InterruptedException e)
		{
			System.out.println("thread handled : " +e);
		}
		    System.out.println("thread is running successfully......");
	}
	public static void main(String args[])
	{
		InterruptingThread1 i = new InterruptingThread1();
		i.start();
		i.interrupt();
	}
}
