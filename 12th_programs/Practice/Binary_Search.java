package Practice;

import java.io.*;
class Binary_Search
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,j,k=0,mid=0;
        int first=0;
        int last=9;
        int loc;
        int num[] = new int [10];
        System.out.println("Enter 10 numbers in the array:");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the number to be searched:");
        loc=Integer.parseInt(in.readLine());
        while(first<=last)
        {
            mid = (first+last)/2;
            if(mid<loc)
                first=first+1;
            if(mid>loc)
                last=last-1;
            if(mid==loc)
            {
                k=1;
                break;
            }
            if(k==1)
                System.out.println("Search Succesful.");
            else
                System.out.println("The number is not present.");
        }
    }
}

        