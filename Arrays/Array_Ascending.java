package Arrays;

import java.io.*;
public class Array_Ascending
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,j,t;
        int num[]=new int[10];
        System.out.println("Enter 10 different numbers in the array: ");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<(9-i);j++)
            {
                if(num[j]>num[j+1])
                {
                    t=num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
            }
        }
        System.out.println("The numbers arranged in ascending order are:");
        for(i=0;i<10;i++)
            System.out.println(num[i]);
    }
}

        