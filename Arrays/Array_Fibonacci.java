package Arrays;

import java.io.*;
public class Array_Fibonacci
//wrong logic
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num, i=0,j=0,l=0;
        int a[]=new int [1];
        System.out.println("Enter a number in the array:");
        num=Integer.parseInt(in.readLine());
        int fib1=0;
        int fib2=1;
        int temp=0;
        System.out.println("The fibonacci numbers are:");
        System.out.print(fib1+" ");
        System.out.print(fib2+" ");
        do
        {
            temp=fib1+fib2;
            a[i]=temp;
            fib1=fib2;
            fib2=temp;
            i++;
        }while(i<1);
        for (j=0;j<l-2;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}