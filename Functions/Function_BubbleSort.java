package Functions;

import java.io.*;
public class Function_BubbleSort
{
    void sort(String name[])
    {
        int j,k;
        String temp;
        for(j=0;j<4;j++)
        {
            for(k=(j+1);k<5;k++)
            {
                if(name[k].compareTo(name[j])<0)
                {
                    temp=name[j];
                    name[j]=name[k];
                    name[k]=temp;
                }
            }
        }
        System.out.println("The names arranged in ascending order:");
        for(j=0;j<5;j++)
        {
            System.out.println(name[j]);
        }
    }

    public static void main (String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i;
        Function_BubbleSort ob=new Function_BubbleSort();
        String name[]=new String[5];
        System.out.println("Enter 5 names:");
        for(i=0;i<5;i++)
        {
            name[i]=in.readLine();
        }
        ob.sort(name);
    }
}