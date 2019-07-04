package Arrays;

import java.io.*;
//Wrong output
public class Array_Merge
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int M,N,i,j,k,T;
        System.out.print("Enter the first array length:");
        M=Integer.parseInt(in.readLine());
        int[]R1=new int[M];
        System.out.println("Enter the sorted elements of R1:");
        for(i=0;i<M;i++)
        {
            R1[i]=Integer.parseInt(in.readLine()); 
        }
        System.out.println("Enter the second array length:");
        N=Integer.parseInt(in.readLine());
        int[]R2=new int[N];
        System.out.println("Enter the sorted elements of R2:");
        for(j=0;j<N;j++)
        {
            R2[j]=Integer.parseInt(in.readLine());
        }
        int[]R3=new int[M+N];
        i=0;
        j=0;
        k=0;
        while(i<M && j<N)
        {
            if(R1[i]<R2[j])
            {
                R3[k]=R1[i];
                k=k+1;
                i=i+1;
            }
            else
            {
                R3[k]=R2[j];
                k=k+1;
                j=j+1;
            }
        }
        System.out.println("The resuled output is as : \n");
        T=M+N;
        for(k=0;k<T;k++)
        {
            System.out.println(R3[k]);
        }
    }
}
