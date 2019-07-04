package Practice;

import java.io.*;
class Bubble_Sort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,j,t;
        int num[] = new int [10];
        System.out.println("Enter 10 numbers in the array:");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<9;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(num[i]>num[j])
                {
                    t=num[i];
                    num[i]=num[j];
                    num[j]=t;
                }
            }
        }
        System.out.println("The numbers arranged in ascending order are:");
        for(i=0;i<10;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}

           
            