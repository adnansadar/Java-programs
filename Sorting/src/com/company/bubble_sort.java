package com.company;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -22, 7, 55, 2};
        int len = arr.length;
        int temp;
        for (int i = len-1; i >0; i--) {
            for (int j = 0; j < len-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }

    }
}
