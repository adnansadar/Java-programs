package Arrays;

import java.io.*;
public class Array1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int a[]=new int[10];
        double n;
        System.out.println("Enter 10 different temperatures in farenhite:");
        for(i=0;i<10;i++)
            a[i]=Integer.parseInt(in.readLine());
        System.out.println("The temperature in celsius !");
        for(i=0;i<10;i++)
        {
            n=(5*a[i]-32)/9;
            if(n>37)
                System.out.println(n);
        }
    }
}