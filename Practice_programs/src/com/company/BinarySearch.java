package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the array: ");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int [size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter no to be searched: ");
        int n = Integer.parseInt(br.readLine());
        BinarySearch ob = new BinarySearch();
        ob.search(size,arr,n);

    }
    public void search(int len,int a[],int num){
        int start = 0;
        int end = len-1;
        for (int i =0;i<len;i++){
        int mid = (start+end)/2;
            if(num==mid)
                System.out.println("Search Successful! "+num+"is present in the array.");
            else if (num < mid){
                end=mid-1;
            }
            else if (num>mid){
                start = mid+1;
            }
            if (i==len-1)
                System.out.println(("The number is not present in the array."));
        }
    }
}
