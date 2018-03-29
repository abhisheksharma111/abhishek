package abhishek;

public class TestThreadTwice extends Thread {
	public void run()
	{
		System.out.println("thread running......");
	}
	public static void main(String args[])
	{
		TestThreadTwice t = new TestThreadTwice();
		t.start();
		//t.start();
	}
}
