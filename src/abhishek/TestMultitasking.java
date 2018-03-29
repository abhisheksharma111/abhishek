package abhishek;

public class TestMultitasking  extends Thread
{
	public void run()
	{
		System.out.println("task one");
	}
	public static void main(String args[])
	{
		TestMultitasking t1 = new TestMultitasking();
		TestMultitasking t2 = new TestMultitasking();
		TestMultitasking t3 = new TestMultitasking();
		TestMultitasking t4 = new TestMultitasking();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
