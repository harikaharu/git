import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		
	int row,col,i,j;
	int x[][]=new int[10][10];
	Scanner scan=new Scanner(System.in);
	System.out.print("enter row of the array :");
	row=scan.nextInt();
	System.out.print("enter column of the array :");
	col=scan.nextInt();
	System.out.println("enter" +(row*col)+"array elements :");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			x[i][j]=scan.nextInt();
		}
	}
	System.out.print("the array is :\n");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.print(x[i][j]+ " ");
		}
		System.out.println();
		}
	}
}
