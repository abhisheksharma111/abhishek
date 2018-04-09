package abhishek;
import java.util.Scanner;
public class FindOddEvenNumber 
{
	public static void main(String args[])
        {
	        Scanner s=new Scanner(System.in);
			System.out.print("enter the number of elements in a array : ");
			int a = s.nextInt();
			int arr[] = new int[a];
			System.out.println("enter all the elements : ");
			for(int i=0; i<a; i++)
			{
				arr[i] = s.nextInt();
			}
			System.out.print("even number : ");
			for(int i=0; i<a; i++)
			{
				if(arr[i]%2==0)
				{
					System.out.print(arr[i] +" ");
				}
			}
			System.out.println("");
			System.out.print("odd number : ");
			for(int i=0; i<a; i++)
			{
				if(arr[i]%2!=0)
				{
					System.out.print(arr[i] +" ");
				}
			}
        }
}