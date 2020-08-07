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
        int l = 0;
        int r = n-1;
        sort(arr,l,r);
        printArr(arr);
    }

    public static void sort(int arr[],int l, int r)
    { 
        if(l<r)
        {
            int pi = partition(arr,l,r);
            sort(arr,l,pi-1);//sorting elements on the left side of the pi
            sort(arr,pi+1,r);//sorting elements on the right side of the pi
        }

    }

    public static int partition(int arr[],int l,int r)
    { 
        int index = (l-1);
        int j = l;
        int pivot = arr[r];
        for(int i = l; i<r;i++)
        {
            if(arr[i]< pivot)
            {
                index++;
                swap(arr,arr[index],arr[i]);// getting smaller elements on the left side of the pivot.
            }
        }
        swap(arr,arr[index+1],pivot); // insert pivot at its appropriate position
        return index+1; // returns the position of partition index
    }
    
    public static void swap(int[]a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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