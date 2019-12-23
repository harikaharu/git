import java.util.Scanner;
public class Average {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of  numer: ");
		int size=scan.nextInt();
		int sum=0;
		float avg;
		int [] x=new int[size];
		System.out.println("enter elements into array:");
		for(int i=0;i<size;i++)
		{
			x[i]=scan.nextInt();
			sum=sum+x[i];
		}
		avg=sum/size;
		
		
		System.out.println("average of the number is : "+sum);
	}

}
