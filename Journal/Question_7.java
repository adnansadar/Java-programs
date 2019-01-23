package Journal;

import java.io.*;
public class Question_7
{
    public static void main(String[]args)throws IOException
    {
        int i,j,flag=0,min=0,max=9,mid=0,t;
        int a[]=new int[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers: ");
        for(i=0;i<10;i++)
        {
            a[i]= Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the number to be searched: ");
        int n=Integer.parseInt(br.readLine());
        for(i=0;i<9;i++)
        {
            for(j=1;j<9-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];  
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }         
        while(min<=max)
        {
            mid=(max+min)/2;
            if(a[mid]<n)
                min=mid+1;
            if(a[mid]>n)
                max=max-1;
            if(a[mid]==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Search succesful");
        else
            System.out.println("Number not found");
    }
}
