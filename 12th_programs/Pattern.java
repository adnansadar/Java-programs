

public class Pattern
{
    public static void main(String args[])
      {
          int A[][]={
                      {13,22,14,23,21},
                      {16,14,15,34,10},
                      {71,-11,10,40,12},
                      {41,13,11,56,19},
                      {22,71,45,12,34}
                    };
          int i,j;
          for(i=0;i<=4;i++)
          {
              for(j=0;j<=4;j++)
              {
                  if(i<=j)
                  {
                     System.out.println(" ");
                    }
                    System.out.print(A[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
                          
                          
    