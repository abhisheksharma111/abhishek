package abhishek;
import java.lang.reflect.Method;

    class Acall {
	private void message()
	{
		System.out.println("hello java");
	}
}
public class AmethodCall {
	public static void main(String args[]) throws Exception
	{
		Class c = Class.forName("Acall");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("message", null);
		m.setAccessible(true);
		m.invoke(o, null);
	}
}