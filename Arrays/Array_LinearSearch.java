package Arrays;

import java.io.*;
public class Array_LinearSearch
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,n,k=0;
        int m[]=new int[10];
        System.out.println("Enter 10 numbers in the array:");
        for(i=0;i<10;i++)
        {
            m[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("\n Enter the number to be searched:");
        n=Integer.parseInt(in.readLine());
        for(i=0;i<10;i++)
        {
            if(n==m[i])
            {
                System.out.println("The number "+n+ "is present in the array.");
                break;
            }
            else
            {
                System.out.println("The number is not present in the array.");
                break;
            }
        }
    }
}
