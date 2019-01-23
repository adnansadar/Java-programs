
import java.io.*;
public class Max_Min_TDA
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int rows=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns: ");
        int columns=Integer.parseInt(br.readLine());
        int array[][]=new int[rows][columns];
        int i,j,max=0,min=0;
        int ctr=0;
        System.out.println("Enter the elements");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                array[i][j]=Integer.parseInt(br.readLine());
            }
        }
        min=array[0][0];max=array[0][0];
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                if(max<array[i][j])
                {
                    max=array[i][j];
                }
                if(min>array[i][j])
                {
                    min=array[i][j];
                }
            }
        }
        System.out.println("The maximum element is "+max+" and the minimum element is "+min);
    }
}
        
