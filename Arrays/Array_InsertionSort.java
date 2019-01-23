package Arrays;

import java.io.*;
public class Array_InsertionSort
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[]N={90,40,60,80,20,30};
        for(int i=1;i<N.length;i++)
        {
            int key=N[i];
            int position=i;
            while(position>0 && N[position-1]>key)
            {
                N[position]=N[position-1];
                position--;
            }
            N[position]=key;
        }
        System.out.println("Sorted numbers are: ");
        for(int i=0;i<N.length;i++)
        {
            System.out.println(N[i]);
        }
    }
}

            