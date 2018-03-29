package abhishek;

public class InterruptingThread3 extends Thread 
{
	public void run()
	{
		for(int i=1; i<=2; i++)
	    {
		if(Thread.interrupted())
		{
			System.out.println("thread is interrupted....");
		}
		else
		{
			System.out.println("thread is running successfully");
		}
	    }
	}
	public static void main(String args[])
	{
		InterruptingThread3 i = new InterruptingThread3();
		InterruptingThread3 i1 = new InterruptingThread3();
		i.start();
		i.interrupt();
		
		i1.start();
	}
}
