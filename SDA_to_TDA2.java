
import java.io.*;
public class SDA_to_TDA2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of SDA");
        int l=Integer.parseInt(br.readLine());
        int A[]=new int[l];
        System.out.println("Enter the elements of SDA");
        int i,j;
        for(i=0;i<l;i++)
        {
            A[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The SDA is :");
        for(i=0;i<l;i++)
        {
            System.out.print(A[i]+"   ");
        }
        int B[][]=new int[l][l];
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                B[i][j]=A[j];
            }
        }
        System.out.println("The equivalent TDA is :");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                System.out.print(B[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
                
        
    