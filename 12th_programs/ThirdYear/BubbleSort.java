package ThirdYear;
import java.util.Scanner;

public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter elements of the array:");
        for(int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array:");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
        BubbleSort ob = new BubbleSort();
        ob.sort(arr,n);
    }

    public void sort(int a[], int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 0; j<n-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    swap(a,j,j+1); 
                }
            }
        }
        System.out.println("\nThe sorted array:");
        for(int k:a){
            System.out.print(k+" ");
        }
    }

    public void swap(int a[],int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
