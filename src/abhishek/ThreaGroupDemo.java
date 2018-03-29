package abhishek;

public class ThreaGroupDemo implements Runnable
{
 public void run()
 {
	 System.out.println(Thread.currentThread().getName());
 }
 public static void main(String args[])
 {
	 ThreaGroupDemo tgd = new ThreaGroupDemo();
	 ThreadGroup tg = new ThreadGroup("parent thread group");
	 
	 Thread t1 = new Thread(tg, tgd, "one");
	 t1.start();
	 Thread t2 = new Thread(tg, tgd, "two");
	 t2.start();
	 Thread t3 = new Thread(tg, tgd, "three");
	 t3.start();
	 
	 System.out.println("Thread :" + tg.getName());
	 tg.list();
	 
 }
}
