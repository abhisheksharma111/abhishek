package abhishek;
import java.sql.Timestamp;    
import java.util.Date;  
import java.text.SimpleDateFormat;  

public class Conversion {
	public static void main(String args[])
	{
		String s = "100";
		Integer i1 = Integer.valueOf(s);
		int i2 = Integer.parseInt(s);
		System.out.println(i1);
		System.out.println(i2);
		
		int i = 10;
		String s1 = String.valueOf(i);
		String s2 = Integer.toString(i);
		System.out.println(s1);
		System.out.println(s2);
		
		String str = "hello";
		for(int n=0; n<str.length(); n++) {
		char c = str.charAt(n);
		System.out.println("char at :" + n + " index is :" + c);
		}
		
		char ch[] =str.toCharArray();
		for(int n1=0; n1<ch.length; n1++) {
			System.out.println("char at :" + n1 + " index is :" + ch[n1]);
		}
		
		int a = 100;
		long l1 = a;
		Long l2 = new Long(a);
		Long l3 = Long.valueOf(a);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println("==============");
		
		long l4 = 100;
		Long l5 = new Long(200);
		int i4 = (int)l4;
		int i5 = l5.intValue();
		System.out.println(l5);
		System.out.println(i4);
		System.out.println(i5);
		
		char c = '1';
		int ii = c;
		int ij = Character.getNumericValue(c);
		int ik = Integer.parseInt(String.valueOf(c));
		System.out.println(ii);
		System.out.println(ij);
		System.out.println(ik);
		System.out.println("==============");
		
		int a1 = 65;
		int a2 = 1;
		char c1 = (char)a1;
		char c2 = (char)a2;
		System.out.println(c1);
		System.out.println(c2);
		int a3=65;    
		char c3=(char)(a3+'0');    
		System.out.println(c3);
		
		System.out.println("===========");
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        System.out.println(ts);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(formatter.format(ts));         
	}
}
