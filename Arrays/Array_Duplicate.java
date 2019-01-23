package Arrays;

import java.io.*;
public class Array_Duplicate
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        int a[]=new int[10];
        int b[]=new int[10];
        System.out.println("Enter 10 numbers in the array:");
        for(i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(a[i]==a[j])
                    a[j]=0;
            }
        }
        j=0;
        for(i=0;i<10;i++)
        {
            if (a[i]!=0)
            {
                b[j]=a[i];
                j=j+1;
            }
        }
        System.out.println("The result after removing the duplicate numbers:");
        for(i=0;i<j;i++)
            System.out.println(b[i]+" ");
    }
}

        