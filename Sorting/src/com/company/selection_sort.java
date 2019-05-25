package com.company;

public class selection_sort {
    public static void main(String[] args) {
        int arr[]={234,151,123,4,5342,76,48};
        int min=0; int temp;
        for(int i=0;i<=arr.length-1;i++){
            min=i;
            for (int k=i+1;k<arr.length;k++){
                if(arr[k]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        for (int j=0;j<=arr.length-1;j++)
            System.out.println(arr[j]+" ");

    }
}
