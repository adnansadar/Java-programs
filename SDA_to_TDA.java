
import java.io.*;
public class SDA_to_TDA
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of SDA");
        int l=Integer.parseInt(br.readLine());
        int A[]=new int[l];
        int B[][]=new int [l][l];
        System.out.println("Enter the elements of the SDA");
        int l1=A.length;
        int i,j;
        for(i=0;i<l1;i++)
        {
            A[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The array is : ");
        for(i=0;i<l1;i++)
        {
            System.out.print(A[i]+"   ");
        }
        for(i=0;i<l1;i++)
        {
            for(j=0;j<(l1-i);j++)
            {
                B[i][j]=A[j];
            }
            while(j<(l1-i))
            {
                B[i][j+1]=0;
                j++;
            }
        }
        System.out.println("The 2D array is : ");
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l1;j++)
            {
                System.out.print(B[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
        