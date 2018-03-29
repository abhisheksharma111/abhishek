package abhishek;

public class InterruptingThread extends Thread
{
	public void run()
	{
		try
		{
		  Thread.sleep(1000);
		  System.out.println("task :");
	    }
		catch(InterruptedException e)
		{
			throw new RuntimeException("thread interrupted :" +e);
		}
    }
	public static void main(String args[])
	{
		InterruptingThread i = new InterruptingThread();
		i.start();
		try
		{
			i.interrupt();
		}
		catch(Exception e)
		{
			System.out.println("exception handled :" +e);
		}
	}
}