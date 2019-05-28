package com.company;

public class merge_sort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2)//returns if array consists of only 1 element
        {
            return;
        }

        int mid = (start + end) / 2;// finding mid point of the array
        mergeSort(input, start, mid);// dividing the left array by 2 to find siblings
        mergeSort(input, mid, end);// dividing right array by 2 to find siblings
        merge(input, start, mid, end);// merging the left and right arrays in the end
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid])//if all elements to the left of mid are less, return
        {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);//copying elements to input array
        System.arraycopy(temp, 0, input, start, tempIndex);//copying elements to the temp array


    }
}
