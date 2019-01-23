package Practice;

import java.io.*;
class Selection_Sort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[10];
        int i,j,t,min;
        System.out.println("Enter 10 numbers in the array:");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<9;i++)
        {
            min=i;
            for(j=i+1;j<10;j++)
            {
                if(num[min]>num[j])
                    min=j;
            }
            t=num[i];
            num[i]=num[min];
            num[min]=t;
        }
        System.out.println("The numbers arranged in ascending order are:");
        for(i=0;i<10;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}

        