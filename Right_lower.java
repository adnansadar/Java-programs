

public class Right_lower
{
    public static void main(String args[])
    {
        int A[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}
                };
        int i,j;
        int k=2;
        System.out.println("The lower right of the array is :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                while(j<k)
                {
                  System.out.print(" ");
                  j++;
                }
                  System.out.print(A[i][j]);
                }

            System.out.println();
            k--;
        }
    }
}
   