
import java.io.*;
public class Multiplication_of_arrays
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int array1[][]={
                      {1,2,3},
                      {4,5,6},
                      {7,8,9}
                    };
      int array2[][]={
                      {8,9,10},
                      {11,12,13},
                      {14,15,16}
                    };
        int i,j,k;
        int array3[][]=new int[3][3];
        System.out.println("First matrix is: ");
        for(i=0;i<3;i++)
         {
                for(j=0;j<3;j++)
                {
                  System.out.print(array1[i][j]+"  ");
                }
                System.out.println();
           }
        System.out.println("Second matrix is: ");
        for(i=0;i<3;i++)
         {
              for(j=0;j<3;j++)
                {
                  System.out.print(array2[i][j]+"  ");
                }
                System.out.println();
            }
            
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    for(k=0;k<3;k++)
                    {
                        array3[i][j]+=array1[i][k]+array2[k][j];
                    }
                }
            }
            System.out.println("The product of the matrices is: ");
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    System.out.print(array3[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
              
   