package abhishek;

    class MemberInnerClass
{
	private int data=10;
	
    class Inner
    {
		 void msg()
		{
			System.out.println(" " +data);
		}
    }
	public static void main(String args[])
	{
		MemberInnerClass m = new MemberInnerClass();
		MemberInnerClass.Inner in = m.new Inner();
		in.msg();
	}

}
