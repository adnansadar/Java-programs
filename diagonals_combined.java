
import java.io.*;
public class diagonals_combined
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of rows of the matrix");
        int r=Integer.parseInt(br.readLine());
        int c=r;
        int i,j,k;
        int A[][]=new int[r][c];
        System.out.println("Enter the elements of the array");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
        if((i==j)||(i+j<r))
        {
            System.out.print(A[i][j]+"  ");
        }
        else
        {
            System.out.println(" ");
        }
    }
}
 
}       
}
        
    