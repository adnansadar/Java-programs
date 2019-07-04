package com.company;

public class SelectionSort {
    public static void main(String[] args) {
    int [] arr = {5,78,2,45,1};
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    for (int i=0;i<arr.length;i++){
        int min = i;
        for (int j=i+1;j<arr.length;j++){
            if (arr[j]<arr[min]){
                min=j;
            }
        }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
    System.out.println("The array after sorting: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
