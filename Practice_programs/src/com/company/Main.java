package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the nos in the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a no to search for: ");
        int num = sc.nextInt();
        for (int j=0;j<n;j++){
            if(arr[j]==num){
                System.out.println("Search successful!");
                System.out.printf("No. found at %d%n position in the array", j+1);
            }
        }
    }
}
