public class pattern2
{
    public static void main (String args[])
    {
        int i,j,k,m,p=0,q=5;
        System.out.println("The required pattern:");
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(p+"\t");
                p=p+1;
            }
            System.out.println();
        }
        for(k=3;k>=1;k--)
        {
            for(m=1;m<=k;m++)
            {
                System.out.print(q+"\t");
                q=q-1;
            }
            System.out.println();
        }
    }
}


            
            