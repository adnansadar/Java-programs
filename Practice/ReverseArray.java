import java.util.*;

public class ReverseArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4};
		int temp = 0;
		for(int i=0;i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		 for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}