package abhishek;

public class LocalInnerClass {
	private int data=20;
	void display()
	
	{
		//int data=30;
		class local
		{
			void msg()
			{
				System.out.println(data);
				//System.out.println(super.data);
			}
		}
			local l = new local();
			l.msg();
		}
		public static void main(String args[])
		{
			LocalInnerClass li = new LocalInnerClass();
			li.display();
		}
	}
