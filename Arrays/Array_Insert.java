package Arrays;

import java.io.*;
class Array_Insert
{
    int arr[]=new int[5];
    int ele,pos;
    void getval()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the element to be inserted:");
        ele=Integer.parseInt(in.readLine());
        System.out.println("Enter position of the element to be inserted:");
        pos=Integer.parseInt(in.readLine());
        System.out.println("Enter array elements:");
        for(int i=0;i<5;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }
    }

    void insert()
    {
        for(int i=3;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
            arr[pos]=ele;
        
    }

    void display()
    {
        System.out.println("Array elements after insertion:");
        for(int j=0;j<5;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
         
            
