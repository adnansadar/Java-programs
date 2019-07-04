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
        int result = ob.search(size,arr,n);
        if(result==-1)
            System.out.println("The no. is not present.");
        else
            System.out.println("The no. is present!");

    }
    public int search(int len,int a[],int num){
        int start = 0;
        int end = len-1;
        for (int i =0;i<len;i++){
            int mid = (start+end)/2;
            if(num==a[mid])
                return num;
            else if (num < a[mid])
                end=mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
}
