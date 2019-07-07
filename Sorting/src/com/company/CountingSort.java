package com.company;

public class CountingSort {
    public static void main(String[] args) {
        int[]arr = {2,5,9,8,2,4,3};
        sort(arr,1,10);//elements in the array ranging 1-10 only
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int [] input,int min,int max){
        int[] countArray = new int[(max-min)+1];
        for(int i=0;i<input.length;i++) {
            countArray[input[i] - min]++;//counting instances of each no and storing it in another array
        }
            int j=0;
            for(int i=min;i<=max;i++){
                while(countArray[i-min]>0){//ex:no of 2s are 2 >0
                    input[j++]=i;//adding elements to the input array
                    countArray[i-min]--;//decrementing the counting array as we do so
            }
        }
    }
}
