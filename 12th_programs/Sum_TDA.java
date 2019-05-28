

public class Sum_TDA
{
    public static void main(String args[])
    {
      int i,j;
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
      int array3[][]=new int[3][3];
        System.out.println("First Matrix is ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(array1[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix is ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(array2[i][j]+"   ");
            }
            System.out.println();
        }
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                array3[i][j]=array1[i][j]+array2[i][j];
            }
        }
        System.out.println("Third Matrix is ");
         for(i=0;i<3;i++)
         {
            for(j=0;j<3;j++)
            {
                System.out.print(array3[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
    