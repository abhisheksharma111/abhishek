package abhishek;

public class TestThreadName extends Thread 
{
	public void run()
	{
		System.out.println("thread running.....");
	}
	public static void main(String args[])
	{
		TestThreadName t1 = new TestThreadName();
		TestThreadName t2 = new TestThreadName();
		TestThreadName t3 = new TestThreadName();
		System.out.println("name of thread1: " + t1.getName());
		System.out.println("name of thread2: " + t2.getName());
		System.out.println("id of thread1: " + t1.getId());
		t1.start();
		t2.start();
		t1.setName("abhishek");
		t2.setName("sharma");
		System.out.println("name of thread1 after changing: " + t1.getName());
		System.out.println("name of thread2 after changing: " + t2.getName());
	}
}
