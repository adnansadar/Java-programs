package Arrays;

import java.io.*;
public class Array_Product
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i,j,k;
        System.out.println("**********PRODUCT OF TWO MATRICES************");
        System.out.println("Enter the number of rows of the first matrix:");
        int r1=Integer.parseInt(in.readLine());
        System.out.println("Enter the number of columns of the first matrix:");
        int c1=Integer.parseInt(in.readLine());
        int Ar1[][]=new int[r1][c1];
        
        System.out.println("Enter the elements of the array:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                Ar1[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("The elements of the first array are:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(Ar1[i][j]+ " ");
                System.out.println();
            }
        }
        int Ar3[][]=new int[50][50];
        System.out.println("Enter the number of rows of the second matrix:");
        int r2=Integer.parseInt(in.readLine());
        System.out.println("Enter the number of columns of the second matrix:");
        int c2=Integer.parseInt(in.readLine());
        int Ar2[][]=new int[r2][c2];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                Ar2[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("The elements of the second array are:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(Ar2[i][j]+" ");
                System.out.println();
            }
        }
        if(r1==c2){
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                for(k=0;k<r1;i++)
                {
                       Ar3[i][j] +=  Ar1[i][k]*Ar2[k][j];
                }
            }
        }
        for(j=0;j<r2;j++)
            {
                for(k=0;k<c2;i++)
                {
                  System.out.print(Ar3[j][k]);
                  System.out.println();
                }
            }
        }
    }
}
        
    

        