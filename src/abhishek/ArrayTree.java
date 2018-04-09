package abhishek;

public class ArrayTree {
	public static void main(String args[])
	{
	/*	int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		for(int i=1;i<=5;i++)
		{
		    for(int j=5;j>i;j--){
		        System.out.println("");   
		  }
		    for(int k=1;k<=i;k++){
		        System.out.print("*");
		    }
		    for(int l=5;l<=1;l++){
		        for(int h=1;h<=5;h++){
		            System.out.print("");
		        }
		    }
		    System.out.println();  
		}
	}
}
