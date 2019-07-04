package Constructors;

import java.io.*;
class Sort
{
    int i,j,k,temp;
    int ar[] = new int [5];
    public void inputdata()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any 5 numbers:");
        for(i=0;i<5;i++)
        {
            ar[i]=Integer.parseInt(in.readLine());
        }
    }

    public void arrange()
    {
        for(i=0;i<4;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }

    public void outputdata()
    {
        System.out.println("The numbers arranged in ascending order are:");
        for(i=0;i<5;i++)
        {
            System.out.print(ar[i]+"\t");
        }
    }
}

                
            
    