package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] array = new int [3];
        array[0]=5;
        array[1]=10;
        array[2]=15;
        int index=-1;
        for (int i=0;i<array.length;i++)
        {
            if(array[i]==10)
            {
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
