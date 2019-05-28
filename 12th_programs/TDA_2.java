
import java.io.*;
public class TDA_2
{
  public static void main(String args[])throws IOException
    {
        int [][] array=new int[4][4];
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                array[i][j]=i*j;
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
        