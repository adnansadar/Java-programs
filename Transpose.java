
import java.io.*;
public class Transpose
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int rows=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns: ");
        int columns=Integer.parseInt(br.readLine());
        int m[][]=new int[rows][columns];
        int n[][]=new int[columns][rows];
        int i,j;
        if(columns==rows)
        {
        System.out.println("Enter the elements");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                m[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The entered array: ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                System.out.print(m[i][j]+ "  ");
            }
            System.out.println();
        }
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                n[j][i]=m[i][j];
            }
        }
        System.out.println("The transpose of the entered array: ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                System.out.print(n[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    else
    {
        System.out.println("Invalid condition");
    }
}
}
                
        