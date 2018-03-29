package abhishek;

abstract class TestAnonymous
{
	abstract void eat();
}
class AnonymousInnerClass
{
	public static void main(String ars[])
	{
		TestAnonymous t = new TestAnonymous()
				{
			      void eat()
			      {
			    	  System.out.println("nice fruit");
			      }
			     };
			      t.eat();
				}
	}
