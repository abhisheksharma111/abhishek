package abhishek;

public class Course 
{
	String sub1;
	String sub2;
	String sub3;
	public Course(String sub1, String sub2, String sub3)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
}
class Student implements Cloneable
{
	int id;
	String name;
	Course course;
	public Student(int id, String name, Course course)
	{
		this.id = id;
		this.name = name;
		this.course = course;
		System.out.println(id + name + course);
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class ObjectShallowCopy
{
	public static void main(String args[])
	{
		Course science = new Course("physics","chemistry","biology");
		Student s1 = new Student(111, "john", "biology");
		Student s2 = null;
		try
		{
			s2 = (Student)s1.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		System.out.println(s1.course.Subject3);
		s2.course.Subject3 = "math";
		System.out.println(s1.course.Subject3);
		}
	}