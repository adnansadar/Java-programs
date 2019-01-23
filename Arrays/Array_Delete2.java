package Arrays;

import java.io.*;
public class Array_Delete2
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,n,m,p=0;
        int num[]=new int[10];
        System.out.println("Enter 10 numbers in the array:");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the number to be deleted:");
        n=Integer.parseInt(in.readLine());
        for(i=0;i<10;i++)
        {
            if(num[i]==n)
                p=i;
        }
        m=p+1;
        for(i=m;i<10;i++)
        {
            num[i-1]=num[i];
        }
        num[9]='\0';
        System.out.println("The new list after deleting an element from the array:");
        for(i=0;i<9;i++)
        {System.out.println(num[i]+"");
        }
    }
}
