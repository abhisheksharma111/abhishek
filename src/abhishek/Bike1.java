package abhishek;

public class Bike1 {
	Bike1()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("instance intializer block");
	}
		public static void main(String args[])
		{
			Bike1 b= new Bike1();
			Bike1 b1= new Bike1();
		}
	}

