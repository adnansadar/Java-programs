package ThirdYear;

import java.util.Scanner;

public class QuickSort
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array:");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
        int[] f = arr.clone();
        for(int k:f)
        {
            System.out.print(k+" ");
        }
        int l = 0;
        int r = n-1;
        sort(arr,l,r);
        printArr(arr);
    }

    public static void sort(int arr[],int l, int r)
    { 
        //when single element is left, l==r and it'll stop dividing further
        if(l<r)
        {
            int pi = partition(arr,l,r);//pi=sorted place of the element in each iteration.
            sort(arr,l,pi-1);//sorting elements on the left side of the pi
            sort(arr,pi+1,r);//sorting elements on the right side of the pi
        }
    }

    public static int partition(int arr[],int l,int r)
    { 
        int pivot = arr[r];  
        int i = (l-1); // index of smaller element 
        for (int j=l; j<r; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
                swap(arr,i,j);
            } 
        }
        //swapping the pivot(arr[r]) and i+1
        swap(arr,i+1,r);
        return i+1; //return partition index
    }

    public static void swap(int [] arr, int i , int j)
    {
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }

    public static void printArr(int [] arr)
    {
        System.out.println("\nThe sorted array:");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
    }
}