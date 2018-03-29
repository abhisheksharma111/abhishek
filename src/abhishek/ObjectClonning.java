package abhishek;

public class ObjectClonning implements Cloneable {
	int rollno;
	String name;
	ObjectClonning(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String args[])
	{
		try
		{
			ObjectClonning o1 = new ObjectClonning(101, "abhishek");
			ObjectClonning o2 = (ObjectClonning)o1.clone();
			System.out.println(o1.rollno + " " + o1.name);
			System.out.println(o2.rollno + " " + o2.name);
		}
		catch(CloneNotSupportedException e)
		{}
	}
}