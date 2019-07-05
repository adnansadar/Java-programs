package com.company;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 56, 1, 0, 34, 98, 8, 5};
        MergeSort ob = new MergeSort();
        System.out.println("The given array: ");
        ob.printArr(arr);
        System.out.println();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("The array after sorting: ");
        ob.printArr(arr);
    }

    private void printArr(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    private void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a,0,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    private void merge(int[]a,int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int n1 = m-l+1;
        int n2 = r-m;
        //Create temp arrays
        int L[] = new int [n1];
        int R[] = new int [n2];
        //Copy data to temp arrays
        for (int i=0;i<n1;++i)
            L[i] = a[l+i];
        for (int j=0;j<n2;++j)
            R[j] = a[m+1+j];
        //Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarry array
        int k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[]
         if any */
        while (i < n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
    }
}
