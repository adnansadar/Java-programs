package ThirdYear;

import java.util.*;
public class ArraysDemo
{

    public static void main(String args[])
    {
        int[]num= {5,23,1,45,2};
        Arrays.sort(num);
        // int[]num2 = new int[num.length];
        for(int i = 0;i<num.length/2;i++)
        {
             int temp = num[i];
             num[i] = num[num.length-1-i];
             num[num.length-1-i] = temp;
        }
        for(int i:num)
        {
            System.out.println(i);
        }
    }
}
