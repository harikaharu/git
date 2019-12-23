public class MinElement {
	public static void main(String[] args) {
		int[] arr=new int[] {25,11,75,45,7,56};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("smallest number in the given array is:"+min);
}
}