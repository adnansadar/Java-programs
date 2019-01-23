import java.io.*;
public class TDA_1
{
    public static void main(String args[])throws IOException
    {
    int [][] array=new int[3][3];
    int i,j;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.print("Enter for row " + i + " and column " + j);
            array[i][j]=Integer.parseInt(br.readLine());
        }
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.print(array[i][j]+ "   ");
        }
        System.out.println();
    }
}
}