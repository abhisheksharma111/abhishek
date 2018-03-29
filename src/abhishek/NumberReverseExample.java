package abhishek;

public class NumberReverseExample {
	public int reverseNumber(int number)
	{
		int reverse=0;
		while(number!=0)
		{
			reverse = (reverse*10)+(number%10);
			number=number/10;
		}
		return reverse;
	}
	public static void main(String args[])
	{
		NumberReverseExample nre = new NumberReverseExample();
		System.out.println("Reverse: " + nre.reverseNumber(12345));
	}

}
