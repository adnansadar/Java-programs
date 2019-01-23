

public class Left_lower
{
    public static void main(String args[])
    {
        int A[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}
                };
        int i,j;
        System.out.println("The lower left of the array is :");
        for(i=0;i<3;i++)
        {
          for(j=0;j<3;j++)
            {
                if(j<=i)
                {
                   System.out.print(A[i][j]);
               }
           }
          System.out.println();
        }
    }
}
        
    