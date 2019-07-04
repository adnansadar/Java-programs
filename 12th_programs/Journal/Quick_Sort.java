package Journal;

import java.io.*;
public class Quick_Sort
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int s,e;
        System.out.println("Enter length of array");
        int n=Integer.parseInt(br.readLine());
        int a[]= new int[n];
        System.out.println("Enter numbers in the array:");
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(br.readLine());
        s=0;  
        e=n-1;
        quicks(a,s,e);
        display(a,n);
    }

    public static void display(int a[], int n)
    {
        System.out.println("Numbers in the array after applying quick sort are:");
        for(int i=0;i<n;i++)
        { 
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    static void quicks(int a[], int start, int end)
    {
        int pIdx = partition(a,start,end);
        if (start < pIdx - 1)
            quicks(a,start,pIdx-1);
        if (pIdx < end)
            quicks(a,pIdx+1,end);
    }

    public static int partition(int a[], int start, int end)
    {
        int idx = start, j = end;
        int temp;
        int pivot = a[(start + end) / 2];
        while (idx <= j) 
        {
            while (a[idx] < pivot)
                idx++;
            while (a[j] > pivot)
                j--;
            if (idx <= j) 
            {
                temp = a[idx];
                a[idx] = a[j];
                a[j] = temp;
                idx++;
                j--;
            }
        }
        return idx;
    }
}
