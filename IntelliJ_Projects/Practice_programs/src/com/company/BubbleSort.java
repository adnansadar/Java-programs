package com.company;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            System.out.println("The array after sorting: ");
            for (int k = 0; k < 5; k++) {
                System.out.print(arr[k] + " ");
            }
    }
}

