
import java.util.Arrays;

/*public class SecondMinElement {
	public static int getSecondMin(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)  
			{
				if(a[i]>a[j])			
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];		
	}
	public static void main(String[] args) {
		int a[]= {1,2,5,6,3,2};
		System.out.println("second smallest number:"+getSecondMin(a,6));		
	}
}
*/
public class SecondMinElement
 {
	 public static int getSecondMin(int[] a,int total)
	 {
		 Arrays.sort(a);
		return a[1];
	 }
	 public static void main(String[] args) {
		int a[]= {1,2,5,3,6,2};
		int b[]= {45,64,72,53,24};
		System.out.println("second smallest :" +getSecondMin(a,6));
		System.out.println("second smallest :" +getSecondMin(b,5));
	 }				
  } 















