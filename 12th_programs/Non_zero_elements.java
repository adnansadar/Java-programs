
import java.io.*;
public class Non_zero_elements
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int rows=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns: ");
        int columns=Integer.parseInt(br.readLine());
        int array[][]=new int[rows][columns];
        int i,j;
        int ctr=0;
        System.out.println("Enter the elements");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                array[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
              if(array[i][j]!=0)
              {
                  ctr++;
                }
            }
        }
        System.out.println("The number of non zero elements ="+ctr);
    }
}
        