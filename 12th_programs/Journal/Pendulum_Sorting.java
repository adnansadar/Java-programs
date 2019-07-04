package Journal;

import java.io.*;
public class Pendulum_Sorting
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i,j,temp;
        System.out.println("Enter length of array");
        int n=Integer.parseInt(br.readLine());
        int p[]= new int[n];
        System.out.println("Enter numbers in the array:");
        for(i=0;i<n;i++)
            p[i]=Integer.parseInt(br.readLine());
        for (i=0;i<n-1;i++)
        {   for (j=0;j<((n-1)-i);j++)
            {    if (p[j+1]<p[j])
                {
                    temp=p[j];
                    p[j]= p[j+1];
                    p[j+1]= temp;
                } 
            }
        }
        int t[] = new int[n];
        int f= 0;  // front pointer
        int r= n-1;  // rear pointer
        i=0;
        if((n%2)!=0)
        {
            while(r!=(f+1))
            {
                if(i==n)
                    break;
                t[r]=p[i];
                r=r-1;
                i=i+1;
                if(i==n)
                    break;
                t[f]=p[i];
                f=f+1;
                i=i+1;
            }
        }
        else
        {   while(r!=f)
            {
                if(i==n)
                    break;
                t[r]=p[i];
                r=r-1;
                i=i+1;
                if(i==n)
                    break;
                t[f]=p[i];
                f=f+1;
                i=i+1;
            }
        }
        System.out.println("Numbers in the array after pendulum arrangement are:");
        for(i=0;i<n;i++)
            System.out.print(t[i]+" ");
        System.out.println("");
    }
}
