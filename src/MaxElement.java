public class MaxElement {
	public static void main(String[] args) {
		int[] arr=new int[] {25,11,75,45,7,56};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("largest number in the given array is:"+max);
}

}
