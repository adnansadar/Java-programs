
import java.io.*;
public class Right_diagonal
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of rows of the matrix");
        int r=Integer.parseInt(br.readLine());
        int c=r;
        int i,j,k,sum=0;
        int A[][]=new int[r][c];
        System.out.println("Enter the elements of the array");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The array is: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
        k=c-1;
        System.out.println("The right diagonal elements are: ");
        for(i=0;i<r;i++)
        {
            System.out.print(A[i][k]);
            k=k-1;
        }
        System.out.println();
    }
}