package Journal;

import java.io.*;
public class Magic_Square
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        int i,j,k,n,t;
        System.out.println("Enter dimension of magic square");
        n=Integer.parseInt(br.readLine());
        int a[][]= new int[n][n];
        for(i=0;i<n;i++)
        {
           for(j=0;j<n;j++) 
            a[i][j]=0;
        }
        if(n%2!=0)
        {
            i=0;  j=n/2;  k=1;
            while(k<=n*n)
            {
                a[i][j]=k++;
                i--;  j++;
                if(i<0 && j>n-1)
                {
                    i=i+2;
                    j--;
                }
                if(i<0)
                 i=n-1;
                if(j>n-1)
                 j=0;
                if(a[i][j]>0)
                {
                    i=i+2;
                    j--;
                }
            }
        }
        else
        {
            k=0;
            for(i=0;i<n;i++)
            {
               for(j=0;j<n;j++) 
                a[i][j]=++k;
            }
            j=n-1;
            for(i=0;i<n/2;i++)
            {
                t=a[i][i];
                a[i][i]=a[j][j];
                a[j][j]=t;
                t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
                j--;
            }
        }
        System.out.println("Magic square of size "+n+" x " +n+" is shown below:");
        for(i=0;i<n;i++)
        {
           for(j=0;j<n;j++) 
            System.out.print(a[i][j]+"\t");
           System.out.println();
        }
    }
}
