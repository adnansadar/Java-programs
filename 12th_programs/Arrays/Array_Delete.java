
package Arrays;

import java.io.*;
public class Array_Delete
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,j,N,num,loc;
        System.out.print("Enter the total numbers in the array:");
        N=Integer.parseInt(in.readLine());
        int[]Arr=new int[N];
        for(j=0;j<N;j++)
        {
            System.out.println("Enter the number" +(j+1)+":");
            Arr[j]=Integer.parseInt(in.readLine());
        }
        System.out.println("Enter the location of the element to be deleted:");
        loc=Integer.parseInt(in.readLine());
        loc=loc-1;
        if(loc<N)
        {
            num=Arr[loc];
            i=loc;
            while(i<N-1)
            {
                Arr[i]=Arr[i+1];
                i=i+1;
            }
            N=N-1;
            System.out.println("The resulted output is: \n");
            for(j=0;j<N;j++)
            {
                System.out.println(Arr[j]);
            }
            System.out.println("The deleted value is : "+num);

        }
        else
            System.out.println("Your location is not in the array to delete.");
    }
}

        