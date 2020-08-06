package ThirdYear;
import java.util.Scanner;

public class MergeSort
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
            int mid = (l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    }

    public static void merge(int arr[],int l,int m, int r)
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 

        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 

        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 

        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
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