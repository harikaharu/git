import java.util.Scanner;
public class ArraySearch {
	private static int num;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  number to search :");
		int size=scan.nextInt();
		int[] x= {10,20,30,40};
		int [] x1=new int[size];
		System.out.println("enter elements into array:");
		for(int i=0;i<size;i++)
		{
			if(x1[i]==num)
			{
				System.out.println("number is present ");
				return;
			}
			else 
			{
				System.out.println("number not present");
			}
		}
				}

}
