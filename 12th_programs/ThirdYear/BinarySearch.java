package ThirdYear;

import java.util.*;
class BinarySearch 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[]arr= {12,43,1,11,65};
		System.out.println("Enter element to be searched: ");
		int element = sc.nextInt();
		int l=0,r=arr.length-1;
		int result=search(arr,element,l,r);
		if(result==-1)
		{
			System.out.println("Element not present!");
		}
		else
		{
			System.out.println("Element present at index: "+result);	
		}
	}

		public static int search(int[]arr,int element,int l,int r)
		{
		if(l!=r)
		{
			int mid = l+(r-1)/2;
			if(element==arr[mid])
			{
				return mid;
			}
			if(element<arr[mid])
			{
				search(arr,element,l,mid-1);
			}
			if(element>arr[mid])
			{
				search(arr,element,mid+1,r);
			}
		}
		return -1;	
	}
		
		// for(int i=0;i<arr.length;i++)
		// {
		// 	if(element<)
		// }
		
	}