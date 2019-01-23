package Journal;

import java.io.*;
public class Question17
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i,j,n;
        System.out.println("Enter dimension of a square matrix");
        n=Integer.parseInt(br.readLine());
        int a[][]= new int[n][n];
        if((n>=2)&&(n<=5))
        {   
            System.out.println("Enter components of the square matrix");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++) 
                    a[i][j]=Integer.parseInt(br.readLine());
            }
            System.out.println("The matrix is:");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++) 
                    System.out.print(a[i][j]+" ");
                System.out.println();
            }
            UpHf(a,n);
            LoHf(a,n);
        }
        else     System.out.println("Wrong Input");
    }

    public static void UpHf(int a[][], int n)
    {
        System.out.println("The Upper-left components of the square matrix are:");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)  {
                if((i+j)<n)
                    System.out.print(a[i][j]+" ");   }
            System.out.println(); 
        } }

    public static void LoHf(int a[][], int n)
    {   
        System.out.println("The Lower-right components of the square matrix are:");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if((i+j)>=n-1)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
